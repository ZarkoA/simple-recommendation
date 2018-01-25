package com.example.simple.recommendation;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.simple.recommendation.database.DataLoader;
import com.example.simple.recommendation.spring.entity.Article;
import com.example.simple.recommendation.spring.entity.Language;
import com.example.simple.recommendation.spring.service.ArticleService;
import com.example.simple.recommendation.spring.service.CategoryService;
import com.example.simple.recommendation.spring.service.LanguageService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleRecommendationApplicationTests {
	
	@Autowired
	ArticleService articleService;
	
	@Autowired
	LanguageService languageService;

	@Autowired
	CategoryService categoryService;

	@Autowired
	private LanguageRecommendation recommender;

	@Autowired
	DataLoader dataLoader;
	
	@Before
	public void setUp() {
		dataLoader.loadData();
	}

	@Test
	public void recommend() {

		Language language = languageService.getLanguageByKey("DE");
		assertEquals("DE", language.getLanguageKey());
		
		Article sportEnglish = articleService.getArticle(1);
		assertEquals("EN", sportEnglish.getLanguage().getLanguageKey());;

		String recommended = recommender.recommend();
		assertEquals("Hello from recommend()", recommended);
	}
}
