package com.example.simple.recommendation.spring.service;

import com.example.simple.recommendation.Recommendable;
import com.example.simple.recommendation.spring.entity.Article;

public interface RecommendationService {
	
	public void recommend(Article article, Recommendable recommendable);
}
