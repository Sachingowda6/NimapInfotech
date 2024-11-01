package com.nimap.task.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nimap.task.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
		
}