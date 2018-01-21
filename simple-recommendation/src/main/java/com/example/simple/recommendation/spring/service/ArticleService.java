package com.example.simple.recommendation.spring.service;

import java.util.List;

import com.example.simple.recommendation.spring.entity.Article;
import com.example.simple.recommendation.spring.entity.Language;

public interface ArticleService {

	void addArticle(Article article);
	List<Article> listArticles();
	List<Language> listMissingLanguages(String articleCode);
}
