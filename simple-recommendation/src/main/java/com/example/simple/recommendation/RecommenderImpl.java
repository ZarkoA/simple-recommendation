package com.example.simple.recommendation;

import org.springframework.stereotype.Component;

@Component
public class RecommenderImpl implements Recommender {

	@Override
	public String recommend() {
		return "Recommended: 123456";
	}
}
