package com.example.simple.recommendation.spring.service;

import java.util.List;

import com.example.simple.recommendation.spring.entity.ArticleMeta;

public interface ArticleMetaService {
	
	void addArticleMeta(ArticleMeta articleMeta);
	List<ArticleMeta> listArticleMetas();
}
