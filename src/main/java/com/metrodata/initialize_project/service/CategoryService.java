package com.metrodata.initialize_project.service;

import org.springframework.stereotype.Service;

import com.metrodata.initialize_project.entity.Category;
import com.metrodata.initialize_project.repository.CategoryRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CategoryService {

    private CategoryRepository categoryRepository;

    public Category create(Category category) {
        return categoryRepository.save(category);
    }

    public Category findOne(Long id) {
        return categoryRepository.findById(id).get();
    }
}
