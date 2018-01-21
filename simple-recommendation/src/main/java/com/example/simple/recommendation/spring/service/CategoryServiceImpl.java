package com.example.simple.recommendation.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.simple.recommendation.spring.dao.CategoryDao;
import com.example.simple.recommendation.spring.entity.Category;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDao categoryDao;

	@Transactional
	@Override
	public void addCategory(Category category) {
		categoryDao.addCategory(category);
	}

	@Transactional
	@Override
	public List<Category> listCategories() {
		return categoryDao.listCategories();
	}
}
