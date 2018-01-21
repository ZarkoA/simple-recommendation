package com.example.simple.recommendation.database;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.simple.recommendation.spring.entity.Article;
import com.example.simple.recommendation.spring.entity.ArticleKeyword;
import com.example.simple.recommendation.spring.entity.Category;
import com.example.simple.recommendation.spring.entity.Improvement;
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
		Language croatian = new Language("HR", "Croatian");
		
		Article sportEnglish = new Article("Sports", "C_01", english, "Sport is good...");
		Article sportGerman = new Article("Sports", "C_01", german, "Sport ist super...");
		Article newsEnglish = new Article("News", "C_02", english, "Todays News...");
		Article newsGerman = new Article("Nachrichten", "C_02", german, "Heutige Nachrichten...");
		
		ArticleKeyword footballEnglish = new ArticleKeyword("Football", sportEnglish);
		ArticleKeyword basketballEnglish = new ArticleKeyword("Basketball", sportEnglish);
		ArticleKeyword golfEnglish = new ArticleKeyword("Golf", sportEnglish);

		ArticleKeyword fußballGerman = new ArticleKeyword("Fußball", sportGerman);
		ArticleKeyword basketballGerman = new ArticleKeyword("Basketball", sportGerman);
		ArticleKeyword golfGerman = new ArticleKeyword("Golf", sportGerman);
		
		Category sport = new Category("Sport");
		Category news = new Category("News");
		
		Improvement sportImprovement = new Improvement(english, 256, 5, 5, sport);

		languageService.addLanguage(english);
		languageService.addLanguage(german);
		languageService.addLanguage(croatian);
		
		articleService.addArticle(sportEnglish);
		articleService.addArticle(sportGerman);
		articleService.addArticle(newsEnglish);
		articleService.addArticle(newsGerman);
		
		
	}	
}
