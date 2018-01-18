package com.example.simple.recommendation.spring.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.simple.recommendation.spring.entity.Article;

@Repository
public class ArticleDaoImpl implements ArticleDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void add(Article article) {
		sessionFactory.getCurrentSession().save(article);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Article> listArticles() {
		Query query = sessionFactory.getCurrentSession().createQuery("from Article");
		return query.list();
	}
}
