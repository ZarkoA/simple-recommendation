package com.example.simple.recommendation.spring.service;

import java.util.List;

import com.example.simple.recommendation.spring.entity.Category;

public interface CategoryService {
	
	void addCategory(Category category);
	List<Category> listCategories();
}
