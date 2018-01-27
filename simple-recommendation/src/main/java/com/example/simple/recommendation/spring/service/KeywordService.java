package com.example.simple.recommendation.spring.service;

import java.util.List;

import com.example.simple.recommendation.spring.entity.Keyword;

public interface KeywordService {

	void addKeyword(Keyword keyword);
	int getArticleKeywordCount(long articleId);
	List<Keyword> listAllKeywords();
	List<Keyword> listArticleKeywords(long articleId);
}
