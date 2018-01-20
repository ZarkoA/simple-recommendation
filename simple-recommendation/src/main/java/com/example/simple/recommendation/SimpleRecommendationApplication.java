package com.example.simple.recommendation;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.simple.recommendation.database.DataLoader;
import com.example.simple.recommendation.spring.config.AppConfig;
import com.example.simple.recommendation.spring.entity.Article;
import com.example.simple.recommendation.spring.service.ArticleService;

@SpringBootApplication
public class SimpleRecommendationApplication {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ArticleService articleService = context.getBean(ArticleService.class);
		DataLoader loader = new DataLoader(context);

		loader.loadData();

		List<Article> articles = articleService.listArticles();
		
		for (Article article : articles) {
			System.out.println("Printing Article Titles");
			System.out.println("Article Title = " + article.getArticleTitle());
			System.out.println();
		}

		context.close();

		SpringApplication.run(SimpleRecommendationApplication.class, args);
	}
}
