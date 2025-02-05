package com.enviro.assessment.grad001.lehlonolomokoena.waste_sorting_api.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data

public class WasteCategoryDTO {
    
    @NotBlank(message = "Category name is required")
    private String name;

    @NotBlank(message = "Disposal guidelines are required")
    private String disposalGuidelines;

    @NotBlank(message = "Recycling tips are required")
    private String recyclingTips;
}
