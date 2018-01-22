package com.example.simple.recommendation;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.simple.recommendation.spring.entity.Article;
import com.example.simple.recommendation.spring.entity.Category;
import com.example.simple.recommendation.spring.entity.Language;
import com.example.simple.recommendation.spring.service.CategoryService;
import com.example.simple.recommendation.spring.service.LanguageService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleRecommendationApplicationTests {

	@Autowired
	LanguageService languageService;
	
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	private Recommendable recommender;
	
	Language english = languageService.getLanguageByKey("EN");
	Category sport = categoryService.getCategoryByTitle("sport");
	
	Article sportEnglish = new Article("Sports", "C_01", english, "Sport is good...", sport, 5);
	
	@Test
	public void recommend() {
		
		List<String> recommended = recommender.recommend(sportEnglish);
		assertEquals("Recommended: 123456", recommended);
	}
}
