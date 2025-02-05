package com.enviro.assessment.grad001.lehlonolomokoena.waste_sorting_api.controller;
import com.enviro.assessment.grad001.lehlonolomokoena.waste_sorting_api.dto.WasteCategoryDTO;
import com.enviro.assessment.grad001.lehlonolomokoena.waste_sorting_api.model.WasteCategory;
import com.enviro.assessment.grad001.lehlonolomokoena.waste_sorting_api.service.WasteCategoryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class WasteCategoryController {
    @Autowired
    private WasteCategoryService service;

    @GetMapping
    public ResponseEntity<List<WasteCategory>> getAllCategories() {
        return ResponseEntity.ok(service.getAllCategories());
    }

    @PostMapping
    public ResponseEntity<WasteCategory> addCategory(@Valid @RequestBody WasteCategoryDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.addCategory(dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable Long id) {
        service.deleteCategory(id);
        return ResponseEntity.noContent().build();
    }
}
