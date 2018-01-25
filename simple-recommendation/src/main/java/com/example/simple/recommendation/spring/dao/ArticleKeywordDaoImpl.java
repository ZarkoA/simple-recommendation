package com.example.simple.recommendation.spring.dao;

import java.util.List;

import org.hibernate.Query;
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

	@Override
	public int getArticleKeywordCount(long articleId) {

		Query query = sessionFactory.getCurrentSession().createQuery("from ArticleKeyword as AK where AK.article.articleId = :articleId");
		query.setParameter("articleId", articleId);
		return query.list().size();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ArticleKeyword> listAllKeywords() {
		return sessionFactory.getCurrentSession().createQuery("from ArticleKeyword").list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ArticleKeyword> listArticleKeywords(long articleId) {

		Query query = sessionFactory.getCurrentSession().createQuery("from ArticleKeyword as AK where AK.article.articleid = :articleId");
		query.setParameter("articleId", articleId);
		
		return query.list();
	}

}
