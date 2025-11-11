CREATE TABLE users (
  id BIGSERIAL PRIMARY KEY,
  name TEXT,
  email TEXT UNIQUE,
  password TEXT
);

CREATE TABLE categories (
  id SMALLSERIAL PRIMARY KEY,
  name TEXT UNIQUE NOT NULL
);

CREATE TABLE foods (
  id BIGSERIAL PRIMARY KEY,
  name TEXT NOT NULL,
  description TEXT,
  category_id SMALLINT REFERENCES categories(id) ON DELETE SET NULL
);

CREATE TABLE pantry_items (
  id BIGSERIAL PRIMARY KEY,
  user_id BIGINT NOT NULL REFERENCES users(id) ON DELETE CASCADE,
  food_id BIGINT REFERENCES foods(id) ON DELETE SET NULL,
  label TEXT NOT NULL,
  quantity NUMERIC(10,2),
  unit TEXT,
  location TEXT,
  expiration_date DATE,
  created_at TIMESTAMPTZ DEFAULT now()
);

CREATE TABLE recipes (
  id BIGSERIAL PRIMARY KEY,
  title TEXT NOT NULL,
  source TEXT,
  instructions TEXT,
  tags JSONB,
  created_at TIMESTAMPTZ DEFAULT now()
);

CREATE TABLE recipe_ingredients (
  id BIGSERIAL PRIMARY KEY,
  recipe_id BIGINT NOT NULL REFERENCES recipes(id) ON DELETE CASCADE,
  food_id BIGINT REFERENCES foods(id) ON DELETE SET NULL,
  label TEXT NOT NULL,
  quantity NUMERIC(10,2),
  unit TEXT,
  optional BOOLEAN DEFAULT FALSE
);

-- Indexes -- make it faster to search through!
CREATE INDEX idx_pantry_user ON pantry_items(user_id);
CREATE INDEX idx_pantry_exp ON pantry_items(expiration_date);
CREATE INDEX idx_ing_recipe ON recipe_ingredients(recipe_id);