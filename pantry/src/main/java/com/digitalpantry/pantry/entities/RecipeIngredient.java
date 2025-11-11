package com.digitalpantry.pantry.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "recipe_ingredients")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class RecipeIngredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Recipe recipe;

    @ManyToOne
    private Food food;

    private String label;
    private Double quantity;
    private String unit;

    private boolean optional;
}