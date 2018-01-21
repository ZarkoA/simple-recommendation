package com.example.simple.recommendation.spring.dao;

import java.util.List;

import com.example.simple.recommendation.spring.entity.ArticleKeyword;

public interface ArticleKeywordDao {

	void addArticleKeyword(ArticleKeyword articleKeyword);
	List<ArticleKeyword> listArticleKeywords();
}
