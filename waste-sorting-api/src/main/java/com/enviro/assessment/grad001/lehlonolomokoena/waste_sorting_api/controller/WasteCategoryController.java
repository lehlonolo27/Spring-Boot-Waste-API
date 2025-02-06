package com.enviro.assessment.grad001.lehlonolomokoena.waste_sorting_api.controller;

// Import necessary dependencies
import com.enviro.assessment.grad001.lehlonolomokoena.waste_sorting_api.dto.WasteCategoryDTO;
import com.enviro.assessment.grad001.lehlonolomokoena.waste_sorting_api.model.WasteCategory;
import com.enviro.assessment.grad001.lehlonolomokoena.waste_sorting_api.service.WasteCategoryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST Controller for managing waste categories.
 * This class handles HTTP requests related to waste categories and interacts with the service layer.
 */
@RestController // Marks this class as a REST controller, making it capable of handling HTTP requests.
@RequestMapping("/api/categories") // Base URL for all endpoints in this controller.
public class WasteCategoryController {

    @Autowired // Injects the WasteCategoryService to interact with business logic.
    private WasteCategoryService service;

    /**
     * Fetches all waste categories from the database.
     *
     * @return ResponseEntity containing a list of waste categories.
     */
    @GetMapping // Handles HTTP GET requests to "/api/categories".
    public ResponseEntity<List<WasteCategory>> getAllCategories() {
        return ResponseEntity.ok(service.getAllCategories());
    }

    /**
     * Adds a new waste category to the database.
     *
     * @param dto The data transfer object containing category details.
     * @return ResponseEntity containing the created WasteCategory with HTTP 201 status.
     */
    @PostMapping // Handles HTTP POST requests to "/api/categories".
    public ResponseEntity<WasteCategory> addCategory(@Valid @RequestBody WasteCategoryDTO dto) {
        // @Valid ensures the DTO passes validation before processing.
        return ResponseEntity.status(HttpStatus.CREATED).body(service.addCategory(dto));
    }

    /**
     * Deletes a waste category by its ID.
     *
     * @param id The ID of the waste category to delete.
     * @return ResponseEntity with HTTP 204 status (No Content) if deletion is successful.
     */
    @DeleteMapping("/{id}") // Handles HTTP DELETE requests to "/api/categories/{id}".
    public ResponseEntity<Void> deleteCategory(@PathVariable Long id) {
        // @PathVariable extracts 'id' from the URL.
        service.deleteCategory(id);
        return ResponseEntity.noContent().build(); // 204 No Content indicates successful deletion.
    }
}
