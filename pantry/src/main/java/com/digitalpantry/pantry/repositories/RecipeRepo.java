package com.digitalpantry.pantry.repositories;

import com.digitalpantry.pantry.entities.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepo extends JpaRepository<Recipe, Long> {
}
