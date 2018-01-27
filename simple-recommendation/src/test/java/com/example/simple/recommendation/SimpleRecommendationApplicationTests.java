package com.example.simple.recommendation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.simple.recommendation.database.DataLoader;
import com.example.simple.recommendation.database.DataLoaderImpl;
import com.example.simple.recommendation.spring.config.AppConfig;
import com.example.simple.recommendation.spring.entity.Article;
import com.example.simple.recommendation.spring.entity.ArticleMeta;
import com.example.simple.recommendation.spring.entity.Category;
import com.example.simple.recommendation.spring.entity.Keyword;
import com.example.simple.recommendation.spring.entity.Language;
import com.example.simple.recommendation.spring.service.ArticleMetaService;
import com.example.simple.recommendation.spring.service.ArticleService;
import com.example.simple.recommendation.spring.service.CategoryService;
import com.example.simple.recommendation.spring.service.KeywordService;
import com.example.simple.recommendation.spring.service.LanguageService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleRecommendationApplicationTests {
	
	private static AnnotationConfigApplicationContext context;
	
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
	private KeywordService keywordService;
	
	private List<Language> languages;
	private List<Category> categories;
	private List<Article> articles;
	private List<ArticleMeta> articleMetas;
	private List<Keyword> keywords;
	
	@BeforeClass
	public static void loadData() {
		context = new AnnotationConfigApplicationContext(AppConfig.class);

		DataLoader loader = new DataLoaderImpl(context);
		loader.loadData();
	}
	
	@AfterClass
	public static void closeContext() {
		context.close();
	}
	
	@Test
	public void languagesExist() {
		languages = languageService.listLanguages();
		assertTrue(languages.size() > 0);
	}

	@Test
	public void categoriesExist() {
		categories = categoryService.listCategories();
		assertTrue(categories.size() > 0);
	}
	
	@Test
	public void articlesExist() {
		articles = articleService.listArticles();
		assertTrue(articles.size() > 0);
	}
	
	@Test
	public void articleMetasExist() {
		articleMetas = articleMetaService.listArticleMetas();
		assertTrue(articleMetas.size() > 0);
	}

	@Test
	public void keywordsExist() {
		keywords = keywordService.listAllKeywords();
		assertTrue(keywords.size() > 0);
	}
	
	@Test
	public void recommend() {

		String recommended = recommender.recommend();
		assertEquals("Hello from recommend()", recommended);
	}
}
