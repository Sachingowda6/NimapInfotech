package com.nimap.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.nimap.task.entity.Category;
import com.nimap.task.service.CategoryService;



@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public Page<Category> getCategories(@RequestParam(defaultValue = "0") int page, 
                                         @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return categoryService.getAllCategories(pageable);
    }
    
    @PostMapping
    public Category createCategory(@RequestBody Category category) {
    return categoryService.createCategory(category);
    }
    
//      @PostMapping  // Ensure this annotation is present
//      public ResponseEntity<List<Category>> createCategories(@RequestBody List<Category> categories) {
//      List<Category> savedCategories = categoryService.saveAll(categories);
//      return ResponseEntity.status(HttpStatus.CREATED).body(savedCategories);
//      }

    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable Long id) {
        return categoryService.getCategoryById(id);
    }
    
  

    @PutMapping("/{id}")
    public Category updateCategory(@PathVariable Long id, @RequestBody Category categoryDetails) {
        return categoryService.updateCategory(id, categoryDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategory(id);
    }
}