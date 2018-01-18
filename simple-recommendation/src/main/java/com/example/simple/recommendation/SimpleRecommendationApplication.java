package com.example.simple.recommendation;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.simple.recommendation.spring.config.AppConfig;
import com.example.simple.recommendation.spring.entity.Article;
import com.example.simple.recommendation.spring.service.ArticleService;

@SpringBootApplication
public class SimpleRecommendationApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		ArticleService articleService = context.getBean(ArticleService.class);

		// Add Users
		articleService.addArticle(new Article("Something Interresting"));
		articleService.addArticle(new Article("Something Boring"));
		articleService.addArticle(new Article("Something for Women"));
		articleService.addArticle(new Article("Something for Men"));

		// Get Users
		List<Article> articles = articleService.listArticles();
		
		for (Article article : articles) {
			System.out.println("Article Title = " + article.getArticleTitle());
			System.out.println();
		}

		context.close();

		SpringApplication.run(SimpleRecommendationApplication.class, args);
	}
}
