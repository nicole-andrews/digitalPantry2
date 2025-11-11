package com.digitalpantry.pantry.repositories;

import com.digitalpantry.pantry.entities.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepo extends JpaRepository<Food, Long> {  
}
