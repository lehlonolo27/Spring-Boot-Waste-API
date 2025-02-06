package com.enviro.assessment.grad001.lehlonolomokoena.waste_sorting_api.service;

// Import necessary classes
import com.enviro.assessment.grad001.lehlonolomokoena.waste_sorting_api.dto.WasteCategoryDTO;
import com.enviro.assessment.grad001.lehlonolomokoena.waste_sorting_api.model.WasteCategory;
import com.enviro.assessment.grad001.lehlonolomokoena.waste_sorting_api.repository.WasteCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class responsible for handling business logic related to waste categories.
 */
@Service // Marks this class as a Spring Service, making it a managed Spring Bean.
public class WasteCategoryService {

    @Autowired // Automatically injects the repository dependency.
    private WasteCategoryRepository repository;

    /**
     * Retrieves all waste categories from the database.
     *
     * @return A list of WasteCategory objects.
     */
    public List<WasteCategory> getAllCategories() {
        return repository.findAll(); // Calls the repository to fetch all categories.
    }

    /**
     * Adds a new waste category to the database.
     *
     * @param dto The Data Transfer Object (DTO) containing category details.
     * @return The saved WasteCategory object.
     */
    public WasteCategory addCategory(WasteCategoryDTO dto) {
        // Create a new WasteCategory entity from the DTO
        WasteCategory category = new WasteCategory();
        category.setName(dto.getName());
        category.setDisposalGuidelines(dto.getDisposalGuidelines());
        category.setRecyclingTips(dto.getRecyclingTips());

        return repository.save(category); // Saves the new category to the database.
    }

    /**
     * Deletes a waste category by its ID.
     *
     * @param id The unique identifier of the waste category to delete.
     */
    public void deleteCategory(Long id) {
        repository.deleteById(id); // Deletes the category from the database.
    }
}
