package com.example.simple.recommendation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.simple.recommendation.database.DataLoader;

@SpringBootApplication
public class SimpleRecommendationApplication {

	@Autowired
	private static DataLoader dataLoader;

	public static void main(String[] args) {

		dataLoader.loadData();
		SpringApplication.run(SimpleRecommendationApplication.class, args);
	}
}
