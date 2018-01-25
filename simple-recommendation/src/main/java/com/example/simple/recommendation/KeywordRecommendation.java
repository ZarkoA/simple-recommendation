package com.example.simple.recommendation;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.simple.recommendation.spring.entity.Article;

@Component
public class KeywordRecommendation implements Recommendable {

	@Override
	public List<String> recommend(Article article) {
		return null;
	}
}
