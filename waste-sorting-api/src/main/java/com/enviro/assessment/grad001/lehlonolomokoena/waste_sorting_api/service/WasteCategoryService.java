package com.enviro.assessment.grad001.lehlonolomokoena.waste_sorting_api.service;
import com.enviro.assessment.grad001.lehlonolomokoena.waste_sorting_api.dto.WasteCategoryDTO;
import com.enviro.assessment.grad001.lehlonolomokoena.waste_sorting_api.model.WasteCategory;
import com.enviro.assessment.grad001.lehlonolomokoena.waste_sorting_api.repository.WasteCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WasteCategoryService {
    @Autowired
    private WasteCategoryRepository repository;

    public List<WasteCategory> getAllCategories() {
        return repository.findAll();
    }

    public WasteCategory addCategory(WasteCategoryDTO dto) {
        WasteCategory category = new WasteCategory();
        category.setName(dto.getName());
        category.setDisposalGuidelines(dto.getDisposalGuidelines());
        category.setRecyclingTips(dto.getRecyclingTips());
        return repository.save(category);
    }

    public void deleteCategory(Long id) {
        repository.deleteById(id);
    }
}
