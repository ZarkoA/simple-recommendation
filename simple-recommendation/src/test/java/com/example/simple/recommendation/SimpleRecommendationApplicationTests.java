package com.example.simple.recommendation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.simple.recommendation.spring.entity.Article;
import com.example.simple.recommendation.spring.entity.ArticleKeyword;
import com.example.simple.recommendation.spring.entity.ArticleMeta;
import com.example.simple.recommendation.spring.entity.Category;
import com.example.simple.recommendation.spring.entity.Language;
import com.example.simple.recommendation.spring.service.ArticleKeywordService;
import com.example.simple.recommendation.spring.service.ArticleMetaService;
import com.example.simple.recommendation.spring.service.ArticleService;
import com.example.simple.recommendation.spring.service.CategoryService;
import com.example.simple.recommendation.spring.service.LanguageService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleRecommendationApplicationTests {
	
	@Autowired
	private ArticleService articleService;
	
	@Autowired
	private LanguageService languageService;

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private LanguageRecommendation recommender;

	@Autowired
	private ArticleMetaService articleMetaService;
	
	@Autowired
	private ArticleKeywordService articleKeywordService;
	
	private List<Language> languages;
	private List<Category> categories;
	private List<Article> articles;
	private List<ArticleMeta> articleMetas;
	private List<ArticleKeyword> articleKeywords;
	
	@Test
	public void languagesExist() {
		languages = languageService.listLanguages();
		assertNotNull(languages);
	}

	@Test
	public void categoriesExist() {
		categories = categoryService.listCategories();
		assertNotNull(categories);
	}
	
	@Test
	public void articlesExist() {
		articles = articleService.listArticles();
		assertNotNull(articles);
	}
	
	@Test
	public void articleMetasExist() {
		articleMetas = articleMetaService.listArticleMetas();
		assertNotNull(articleMetas);
	}

	@Test
	public void articleKeywordsExist() {
		articleKeywords = articleKeywordService.listAllKeywords();
		assertNotNull(articleKeywords);
	}
	
	@Test
	public void recommend() {

		String recommended = recommender.recommend();
		assertEquals("Hello from recommend()", recommended);
	}
}
