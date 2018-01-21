package com.example.simple.recommendation.spring.dao;

import java.util.List;

import com.example.simple.recommendation.spring.entity.Article;
import com.example.simple.recommendation.spring.entity.Language;

public interface ArticleDao {
	
	void add(Article article);
	List<Article> listArticles();
	Article getArticle(long articleId);
	public List<Language> listMissingLanguages(Article article);
}
