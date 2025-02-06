package com.enviro.assessment.grad001.lehlonolomokoena.waste_sorting_api.dto;

// Import validation annotations for input validation
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * Data Transfer Object (DTO) for Waste Category.
 * This class is used to transfer data between the client and the server.
 * It ensures that only the required fields are sent and received.
 */
@Data // Lombok annotation that automatically generates getters, setters, and constructors.
public class WasteCategoryDTO {
    
    /**
     * Name of the waste category (e.g., Plastic, Paper, Glass).
     * It cannot be blank due to the @NotBlank annotation.
     */
    @NotBlank(message = "Category name is required") // Ensures this field is not empty or null.
    private String name;

    /**
     * Guidelines on how to properly dispose of this waste category.
     * It cannot be blank due to the @NotBlank annotation.
     */
    @NotBlank(message = "Disposal guidelines are required") // Ensures this field is not empty or null.
    private String disposalGuidelines;

    /**
     * Tips for recycling this waste category to promote sustainability.
     * It cannot be blank due to the @NotBlank annotation.
     */
    @NotBlank(message = "Recycling tips are required") // Ensures this field is not empty or null.
    private String recyclingTips;
}
