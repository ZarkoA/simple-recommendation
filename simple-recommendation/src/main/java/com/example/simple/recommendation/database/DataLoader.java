package com.example.simple.recommendation.database;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.simple.recommendation.spring.entity.Category;
import com.example.simple.recommendation.spring.entity.ArticleMeta;
import com.example.simple.recommendation.spring.entity.Language;
import com.example.simple.recommendation.spring.service.ArticleKeywordService;
import com.example.simple.recommendation.spring.service.ArticleService;
import com.example.simple.recommendation.spring.service.CategoryService;
import com.example.simple.recommendation.spring.service.ArticleMetaService;
import com.example.simple.recommendation.spring.service.LanguageService;

public class DataLoader {
	
	private AnnotationConfigApplicationContext context;
	
	private ArticleService articleService;
	private ArticleKeywordService articleKeywordService;
	private LanguageService languageService;
	private CategoryService categoryService;
	private ArticleMetaService improvementService;
	
	public DataLoader(AnnotationConfigApplicationContext newContext) {
		
		context = newContext;
		
		articleService = context.getBean(ArticleService.class);
		articleKeywordService = context.getBean(ArticleKeywordService.class);
		languageService = context.getBean(LanguageService.class);
		categoryService = context.getBean(CategoryService.class);
		improvementService = context.getBean(ArticleMetaService.class);
	};
	
	public void loadData() {
		
		Language english = new Language("EN", "English");
		Language german = new Language("DE", "German");
		Language croatian = new Language("HR", "Croatian");

		Category sport = new Category("Sport");
		Category news = new Category("News");
		
//		Article sportEnglish = new Article("Sports", "C_01", english, "Sport is good...", sport, 5);
//		Article sportGerman = new Article("Sport", "C_01", german, "Sport ist super...", sport, 2);
//		Article newsEnglish = new Article("News", "C_02", english, "Todays News...", news, 2);
//		Article newsCroatian = new Article("Novosti", "C_02", croatian, "Novosti danas...", news, 7);
//		
//		ArticleKeyword footballEnglish = new ArticleKeyword("Football", sportEnglish);
//		ArticleKeyword basketballEnglish = new ArticleKeyword("Basketball", sportEnglish);
//		ArticleKeyword golfEnglish = new ArticleKeyword("Golf", sportEnglish);
//
//		ArticleKeyword fußballGerman = new ArticleKeyword("Fußball", sportGerman);
//		ArticleKeyword basketballGerman = new ArticleKeyword("Basketball", sportGerman);
//		ArticleKeyword golfGerman = new ArticleKeyword("Golf", sportGerman);
//
//		ArticleKeyword politicsEnglish = new ArticleKeyword("Politics", newsEnglish);
//		ArticleKeyword economyEnglish = new ArticleKeyword("Economy", newsEnglish);
//		ArticleKeyword weatherEnglish = new ArticleKeyword("Weather", newsEnglish);
//		ArticleKeyword artsEnglish = new ArticleKeyword("Arts", newsEnglish);
//		
//		ArticleKeyword politicsCroatian = new ArticleKeyword("Politika", newsCroatian);
//		ArticleKeyword economyCroatian = new ArticleKeyword("Ekonomija", newsCroatian);
//		ArticleKeyword weatherCroatian = new ArticleKeyword("Vrijeme", newsCroatian);
		
		ArticleMeta sportImprovementEnglish = new ArticleMeta(english, 500, 5, 5, sport);
		ArticleMeta sportImprovementGerman = new ArticleMeta(german, 400, 7, 5, news);
		ArticleMeta newsImprovementCroatian = new ArticleMeta(croatian, 750, 6, 5, news);
		ArticleMeta newsImprovementEnglish = new ArticleMeta(english, 900, 5, 3, news);

		languageService.addLanguage(english);
		languageService.addLanguage(german);
		languageService.addLanguage(croatian);
		
		categoryService.addCategory(sport);
		categoryService.addCategory(news);
		
//		articleService.addArticle(sportEnglish);
//		articleService.addArticle(sportGerman);
//		articleService.addArticle(newsEnglish);
//		articleService.addArticle(newsCroatian);
		
//		articleKeywordService.addArticleKeyword(footballEnglish);
//		articleKeywordService.addArticleKeyword(basketballEnglish);
//		articleKeywordService.addArticleKeyword(golfEnglish);
//		articleKeywordService.addArticleKeyword(fußballGerman);
//		articleKeywordService.addArticleKeyword(basketballGerman);
//		articleKeywordService.addArticleKeyword(golfGerman);
//		articleKeywordService.addArticleKeyword(politicsEnglish);
//		articleKeywordService.addArticleKeyword(economyEnglish);
//		articleKeywordService.addArticleKeyword(weatherEnglish);
//		articleKeywordService.addArticleKeyword(artsEnglish);
//		articleKeywordService.addArticleKeyword(politicsCroatian);
//		articleKeywordService.addArticleKeyword(economyCroatian);
//		articleKeywordService.addArticleKeyword(weatherCroatian);
	}	
}
