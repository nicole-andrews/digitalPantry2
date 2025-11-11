package com.digitalpantry.pantry.repositories;

import com.digitalpantry.pantry.entities.RecipeIngredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeIngredientRepo extends JpaRepository<RecipeIngredient, Long> {
}
