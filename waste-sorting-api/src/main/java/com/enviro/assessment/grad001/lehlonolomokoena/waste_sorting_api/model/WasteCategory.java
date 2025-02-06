package com.enviro.assessment.grad001.lehlonolomokoena.waste_sorting_api.model;

// Import JPA annotations for database mapping
import jakarta.persistence.*;
// Import validation annotations for input validation
import jakarta.validation.constraints.NotBlank;
// Import Lombok annotations to reduce boilerplate code
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * WasteCategory Entity.
 * This class represents the waste_categories table in the database.
 */
@Entity // Marks this class as a JPA entity, meaning it will be mapped to a database table.
@Table(name = "waste_categories") // Specifies the table name in the database.
@Data // Lombok annotation to automatically generate getters, setters, and other utility methods.
@AllArgsConstructor // Generates a constructor with all fields.
@NoArgsConstructor // Generates a no-argument constructor.
public class WasteCategory {

    /**
     * Unique identifier for each waste category.
     * Auto-generated using @GeneratedValue with IDENTITY strategy.
     */
    @Id // Marks this field as the primary key.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increments the ID value.
    private Long id;

    /**
     * Name of the waste category (e.g., Plastic, Paper, Glass).
     * This field cannot be blank due to @NotBlank annotation.
     */
    @NotBlank(message = "Category name is required") // Ensures this field is not empty or null.
    private String name;

    /**
     * Guidelines on how to properly dispose of this waste category.
     * This field cannot be blank due to @NotBlank annotation.
     */
    @NotBlank(message = "Disposal guidelines are required") // Ensures this field is not empty or null.
    private String disposalGuidelines;

    /**
     * Tips for recycling this waste category to promote sustainability.
     * This field cannot be blank due to @NotBlank annotation.
     */
    @NotBlank(message = "Recycling tips are required") // Ensures this field is not empty or null.
    private String recyclingTips;
}
