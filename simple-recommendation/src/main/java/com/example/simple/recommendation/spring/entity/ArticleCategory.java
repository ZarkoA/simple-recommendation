package com.example.simple.recommendation.spring.entity;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ARTICLE_CATEGORY")
public class ArticleCategory {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private long id;
	
	@Column(name = "ARTICLE_ID")
	private long articleId;
	
	@Column(name = "CATEGORY_ID")
	private long categoryId;
}
