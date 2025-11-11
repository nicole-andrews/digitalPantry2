package com.digitalpantry.pantry.repositories;

import com.digitalpantry.pantry.entities.PantryItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PantryItemRepo extends JpaRepository<PantryItem, Long> {
}