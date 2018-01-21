package com.example.simple.recommendation.database;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.simple.recommendation.spring.entity.Article;
import com.example.simple.recommendation.spring.entity.Language;
import com.example.simple.recommendation.spring.service.ArticleCategoryService;
import com.example.simple.recommendation.spring.service.ArticleService;
import com.example.simple.recommendation.spring.service.CategoryService;
import com.example.simple.recommendation.spring.service.ImprovementService;
import com.example.simple.recommendation.spring.service.LanguageService;

public class DataLoader {
	
	private AnnotationConfigApplicationContext context;
	private ArticleService articleService;
	private LanguageService languageService;
	private CategoryService categoryService;
	private ArticleCategoryService articleCategoryService;
	private ImprovementService improvementService;
	
	public DataLoader(AnnotationConfigApplicationContext newContext) {
		
		context = newContext;
		
		articleService = context.getBean(ArticleService.class);
		languageService = context.getBean(LanguageService.class);
		categoryService = context.getBean(CategoryService.class);
		articleCategoryService = context.getBean(ArticleCategoryService.class);
		improvementService = context.getBean(ImprovementService.class);
	};
	
	public void loadData() {
		
		Language english = new Language("EN", "English");
		Language german = new Language("DE", "German");
		Language french = new Language("FR", "French");
		Language italian = new Language("IT", "Italian");
		Language spanish = new Language("ES", "Spanish");
		
		Article sportSpanish = new Article("Deporte", "C_01", spanish, "El deporte es genial...");
		Article newsGerman = new Article("Nachrichten", "C_02", german, "Heutige Nachrichten...");
		Article weatherItalien = new Article("Tempo", "C_03", italian, "Oggi sarà soleggiato...");
		Article computersGerman = new Article("About Computers", "C_04", german, "Über Computer...");
		Article fashionGerman = new Article("About Fashion", "C_04", german, "Fashion Today...");
		
		languageService.addLanguage(english);
		languageService.addLanguage(german);
		languageService.addLanguage(french);
		languageService.addLanguage(italian);
		languageService.addLanguage(spanish);
		
		articleService.addArticle(sportSpanish);
		articleService.addArticle(newsGerman);
		articleService.addArticle(weatherItalien);
		articleService.addArticle(computersGerman);
		articleService.addArticle(fashionGerman);
		
		
	}	
}
