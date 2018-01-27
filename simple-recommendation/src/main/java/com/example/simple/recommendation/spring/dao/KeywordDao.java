package com.example.simple.recommendation.spring.dao;

import java.util.List;

import com.example.simple.recommendation.spring.entity.Keyword;

public interface KeywordDao {

	void addKeyword(Keyword keyword);
	int getArticleKeywordCount(long articleId);
	List<Keyword> listAllKeywords();
	List<Keyword> listArticleKeywords(long articleId);
}
