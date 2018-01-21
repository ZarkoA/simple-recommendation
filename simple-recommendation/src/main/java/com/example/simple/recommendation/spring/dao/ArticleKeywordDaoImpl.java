package com.example.simple.recommendation.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.simple.recommendation.spring.entity.ArticleKeyword;

@Repository
public class ArticleKeywordDaoImpl implements ArticleKeywordDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addArticleKeyword(ArticleKeyword articleKeyword) {
		sessionFactory.getCurrentSession().save(articleKeyword);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ArticleKeyword> listArticleKeywords() {
		return sessionFactory.getCurrentSession().createQuery("from ArticleKeyword").list();
	}
}
