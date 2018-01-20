package com.example.simple.recommendation.spring.service;

import java.util.List;

import com.example.simple.recommendation.spring.entity.ArticleCategory;

public interface ArticleCategoryService {
	
	void addArticleCategory(ArticleCategory articleCategory);
	List<ArticleCategory> listArticleCategories();
}
