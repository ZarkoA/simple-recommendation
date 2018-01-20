package com.example.simple.recommendation.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.simple.recommendation.spring.dao.ArticleCategoryDao;
import com.example.simple.recommendation.spring.entity.ArticleCategory;

@Service
public class ArticleCategoryServiceImpl implements ArticleCategoryService {

	@Autowired
	ArticleCategoryDao articleCategoryDao;
	
	@Transactional
	@Override
	public void addArticleCategory(ArticleCategory articleCategory) {
		articleCategoryDao.add(articleCategory);
	}

	@Transactional
	@Override
	public List<ArticleCategory> listArticleCategories() {
		return articleCategoryDao.listArticleCategories();
	}
}
