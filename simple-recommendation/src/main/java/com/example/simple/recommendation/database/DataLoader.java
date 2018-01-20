package com.example.simple.recommendation.database;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.simple.recommendation.spring.entity.Article;
import com.example.simple.recommendation.spring.entity.Language;
import com.example.simple.recommendation.spring.service.ArticleService;
import com.example.simple.recommendation.spring.service.LanguageService;

public class DataLoader {
	
	private AnnotationConfigApplicationContext context;
	private ArticleService articleService;
	private LanguageService languageService;
	
	public DataLoader(AnnotationConfigApplicationContext newContext) {
		context = newContext;
		articleService = context.getBean(ArticleService.class);
		languageService = context.getBean(LanguageService.class);
	};
	
	public void loadData() {
		
		//Define Languages
		Language english = new Language("EN", "English");
		Language german = new Language("DE", "German");
		Language french = new Language("FR", "French");
		Language italian = new Language("IT", "Italian");
		Language spanish = new Language("ES", "Spanish");
		
		
		//Load Languages
		languageService.addLanguage(english);
		languageService.addLanguage(german);
		languageService.addLanguage(french);
		languageService.addLanguage(italian);
		languageService.addLanguage(spanish);
		
		
		//Load Articles
		articleService.addArticle(new Article("Something Interresting", spanish));
		articleService.addArticle(new Article("Something Boring", german));
		articleService.addArticle(new Article("Something for Women", italian));
		articleService.addArticle(new Article("Something for Men", german));	
	}	
}
