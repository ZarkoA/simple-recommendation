package com.example.simple.recommendation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.simple.recommendation.database.DataLoader;
import com.example.simple.recommendation.database.DataLoaderImpl;
import com.example.simple.recommendation.spring.config.AppConfig;

@SpringBootApplication
public class SimpleRecommendationApplication {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		DataLoader loader = new DataLoaderImpl(context);
		loader.loadData();
		
		context.close();
		SpringApplication.run(SimpleRecommendationApplication.class, args);
	}
}
