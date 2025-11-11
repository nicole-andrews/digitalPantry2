package com.digitalpantry.pantry.repositories;

import com.digitalpantry.pantry.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}
