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
	@Column(name = "ID", unique = true)
	private long articleCategoryId;
	
	@Column(name = "ARTICLE_ID")
	private long articleId;
	
	@Column(name = "CATEGORY_ID")
	private long categoryId;

	public long getArticleId() {
		return articleId;
	}

	public void setArticleId(long articleId) {
		this.articleId = articleId;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public long getArticleCategoryId() {
		return articleCategoryId;
	}

	public void setArticleCategoryId(long articleCategoryId) {
		this.articleCategoryId = articleCategoryId;
	}
}
