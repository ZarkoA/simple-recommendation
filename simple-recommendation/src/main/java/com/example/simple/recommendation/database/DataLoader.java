package com.example.simple.recommendation.database;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.simple.recommendation.spring.entity.Article;
import com.example.simple.recommendation.spring.entity.ArticleKeyword;
import com.example.simple.recommendation.spring.entity.Category;
import com.example.simple.recommendation.spring.entity.Language;
import com.example.simple.recommendation.spring.service.ArticleKeywordService;
import com.example.simple.recommendation.spring.service.ArticleService;
import com.example.simple.recommendation.spring.service.CategoryService;
import com.example.simple.recommendation.spring.service.ImprovementService;
import com.example.simple.recommendation.spring.service.LanguageService;

public class DataLoader {
	
	private AnnotationConfigApplicationContext context;
	
	private ArticleService articleService;
	private ArticleKeywordService articleKeywordService;
	private LanguageService languageService;
	private CategoryService categoryService;
	private ImprovementService improvementService;
	
	public DataLoader(AnnotationConfigApplicationContext newContext) {
		
		context = newContext;
		
		articleService = context.getBean(ArticleService.class);
		articleKeywordService = context.getBean(ArticleKeywordService.class);
		languageService = context.getBean(LanguageService.class);
		categoryService = context.getBean(CategoryService.class);
		improvementService = context.getBean(ImprovementService.class);
	};
	
	public void loadData() {
		
		Language english = new Language("EN", "English");
		Language german = new Language("DE", "German");
		Language croatian = new Language("HR", "Croatian");

		Category sport = new Category("Sport");
		Category news = new Category("News");
		
		Article sportEnglish = new Article("Sports", "C_01", english, "Sport is good...", sport);
		Article sportGerman = new Article("Sport", "C_01", german, "Sport ist super...", sport);
		Article newsEnglish = new Article("News", "C_02", english, "Todays News...", news);
		Article newsCroatian = new Article("Novosti", "C_02", croatian, "Novosti danas...", news);
		
		ArticleKeyword footballEnglish = new ArticleKeyword("Football", sportEnglish);
		ArticleKeyword basketballEnglish = new ArticleKeyword("Basketball", sportEnglish);
		ArticleKeyword golfEnglish = new ArticleKeyword("Golf", sportEnglish);

		ArticleKeyword fußballGerman = new ArticleKeyword("Fußball", sportGerman);
		ArticleKeyword basketballGerman = new ArticleKeyword("Basketball", sportGerman);
		ArticleKeyword golfGerman = new ArticleKeyword("Golf", sportGerman);

		ArticleKeyword politicsEnglish = new ArticleKeyword("Politics", newsEnglish);
		ArticleKeyword economyEnglish = new ArticleKeyword("Economy", newsEnglish);
		ArticleKeyword weatherEnglish = new ArticleKeyword("Weather", newsEnglish);
		ArticleKeyword artsEnglish = new ArticleKeyword("Arts", newsEnglish);
		
		ArticleKeyword politicsCroatian = new ArticleKeyword("Politika", newsCroatian);
		ArticleKeyword economyCroatian = new ArticleKeyword("Ekonomija", newsCroatian);
		ArticleKeyword weatherCroatian = new ArticleKeyword("Vrijeme", newsCroatian);
		
		
		
		
//		Improvement sportImprovement = new Improvement(english, 256, 5, 5, sport);

		languageService.addLanguage(english);
		languageService.addLanguage(german);
		languageService.addLanguage(croatian);
		
		articleService.addArticle(sportEnglish);
		articleService.addArticle(sportGerman);
		articleService.addArticle(newsEnglish);
		articleService.addArticle(newsCroatian);
		
		articleKeywordService.addArticleKeyword(footballEnglish);
		articleKeywordService.addArticleKeyword(basketballEnglish);
		articleKeywordService.addArticleKeyword(golfEnglish);
		articleKeywordService.addArticleKeyword(fußballGerman);
		articleKeywordService.addArticleKeyword(basketballGerman);
		articleKeywordService.addArticleKeyword(golfGerman);
		articleKeywordService.addArticleKeyword(politicsEnglish);
		articleKeywordService.addArticleKeyword(economyEnglish);
		articleKeywordService.addArticleKeyword(weatherEnglish);
		articleKeywordService.addArticleKeyword(artsEnglish);
		articleKeywordService.addArticleKeyword(politicsCroatian);
		articleKeywordService.addArticleKeyword(economyCroatian);
		articleKeywordService.addArticleKeyword(weatherCroatian);
	}	
}
