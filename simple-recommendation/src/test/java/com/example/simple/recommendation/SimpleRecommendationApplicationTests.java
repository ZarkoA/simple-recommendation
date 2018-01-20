package com.example.simple.recommendation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleRecommendationApplicationTests {

//	@Autowired
//	private ApplicationContext applicationContext;
	
	@Autowired
	private Recommender recommender;
	
	@Test
	public void recommend() {
		String recommended = recommender.recommend();
		assertEquals("Recommended: 123456", recommended);
	}
}
