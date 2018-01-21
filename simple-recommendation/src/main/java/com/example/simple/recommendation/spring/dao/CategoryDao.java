package com.example.simple.recommendation.spring.dao;

import java.util.List;

import com.example.simple.recommendation.spring.entity.Category;

public interface CategoryDao {

	void addCategory(Category category);
	List<Category> listCategories();
}
