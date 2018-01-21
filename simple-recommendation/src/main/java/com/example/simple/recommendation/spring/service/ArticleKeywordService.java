package com.example.simple.recommendation.spring.service;

import java.util.List;

import com.example.simple.recommendation.spring.entity.ArticleKeyword;

public interface ArticleKeywordService {

	void addArticleKeyword(ArticleKeyword articleKeyword);
	int getArticleKeywordCount(long articleId);
	List<ArticleKeyword> listArticleKeywords();
}
