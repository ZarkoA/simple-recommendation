package com.example.simple.recommendation.database;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.simple.recommendation.spring.entity.Article;
import com.example.simple.recommendation.spring.service.ArticleService;

public class DataLoader {
	
	private AnnotationConfigApplicationContext context;
	private ArticleService articleService;
	
	public DataLoader(AnnotationConfigApplicationContext newContext) {
		context = newContext;
		articleService = context.getBean(ArticleService.class);
	};
	
	public void loadData() {
		
		//Load Articles
		articleService.addArticle(new Article("Something Interresting"));
		articleService.addArticle(new Article("Something Boring"));
		articleService.addArticle(new Article("Something for Women"));
		articleService.addArticle(new Article("Something for Men"));	
	}	
}
