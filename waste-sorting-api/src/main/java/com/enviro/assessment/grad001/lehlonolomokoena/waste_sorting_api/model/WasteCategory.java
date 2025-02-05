package com.enviro.assessment.grad001.lehlonolomokoena.waste_sorting_api.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "waste_categories")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class WasteCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Category name is required")
    private String name;

    @NotBlank(message = "Disposal guidelines are required")
    private String disposalGuidelines;

    @NotBlank(message = "Recycling tips are required")
    private String recyclingTips;
}
