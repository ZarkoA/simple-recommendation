package com.example.simple.recommendation.spring.dao;

import java.util.List;

import com.example.simple.recommendation.spring.entity.ArticleCategory;

public interface ArticleCategoryDao {
	
	void add(ArticleCategory articleCategory);
	List<ArticleCategory> listArticleCategories();
}
