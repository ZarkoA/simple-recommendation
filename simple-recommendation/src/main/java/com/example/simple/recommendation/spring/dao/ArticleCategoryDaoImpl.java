package com.example.simple.recommendation.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.simple.recommendation.spring.entity.ArticleCategory;

@Repository
public class ArticleCategoryDaoImpl implements ArticleCategoryDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void add(ArticleCategory articleCategory) {
		sessionFactory.getCurrentSession().save(articleCategory);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ArticleCategory> listArticleCategories() {
		return sessionFactory.getCurrentSession().createQuery("from ArticleCategory").list();
	}
}
