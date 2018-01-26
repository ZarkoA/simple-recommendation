package com.example.simple.recommendation.spring.dao;

import java.util.List;

import com.example.simple.recommendation.spring.entity.ArticleMeta;

public interface ArticleMetaDao {

	void addArticleMeta(ArticleMeta improvement);
	List<ArticleMeta> listArticleMetas();
}
