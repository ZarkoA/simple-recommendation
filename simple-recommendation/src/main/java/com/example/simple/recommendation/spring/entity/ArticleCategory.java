package com.example.simple.recommendation.spring.entity;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ARTICLE_CATEGORY")
public class ArticleCategory {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true)
	private long articleCategoryId;
	
	@OneToOne
	@JoinColumn(name = "ARTICLE_CODE")
	private Article article;
	
	@OneToOne
	@JoinColumn(name = "ID")
	private Category category;
	
	public long getArticleCategoryId() {
		return articleCategoryId;
	}

	public void setArticleCategoryId(long articleCategoryId) {
		this.articleCategoryId = articleCategoryId;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}
