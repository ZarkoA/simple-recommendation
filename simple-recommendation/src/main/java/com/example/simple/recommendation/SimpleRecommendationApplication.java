package com.example.simple.recommendation;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.simple.recommendation.database.DataLoader;
import com.example.simple.recommendation.spring.config.AppConfig;
import com.example.simple.recommendation.spring.entity.Article;
import com.example.simple.recommendation.spring.entity.Language;
import com.example.simple.recommendation.spring.service.ArticleService;
import com.example.simple.recommendation.spring.service.LanguageService;

@SpringBootApplication
public class SimpleRecommendationApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ArticleService articleService = context.getBean(ArticleService.class);
		LanguageService languageService = context.getBean(LanguageService.class);
		DataLoader loader = new DataLoader(context);

		loader.loadData();

		List<Article> articles = articleService.listArticles();

		for (Article article : articles) {
			System.out.println("Article Title = " + article.getTitle());
			System.out.println("Article Language = " + article.getLanguage().getLanguageKey());
			System.out.println("Article Code = " + article.getArticleCode());
			System.out.println();
		}

		List<Language> languages = languageService.listLanguages();

		for (Language language : languages) {
			System.out.println("Printing Languages");
			System.out.println("Language = " + language.getLanguageKey() + ", " + language.getDescription());
			System.out.println();
		}
		
		List<Language> missingLanguages = articleService.listMissingLanguages("C_01");
		for(Language missingLanguage : missingLanguages) {
			System.out.println("Missing Languages");
			System.out.println("Languages missing for an Article: " + missingLanguage.getLanguageKey());
		}
		
		context.close();

		SpringApplication.run(SimpleRecommendationApplication.class, args);
	}
}
