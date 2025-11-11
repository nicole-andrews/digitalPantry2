package com.digitalpantry.pantry.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "pantry_items")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PantryItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Food food;

    private String label;

    private Double quantity;
    private String unit;
    private String location;

    private LocalDate expirationDate;
}
