package com.example.simple.recommendation.spring.entity;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ARTICLE_KEYWORD")
public class ArticleKeyword {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true)
	private Long articleKeywordId;
	
	@Column(name = "KEYWORD")
	private String keyword;
	
	@ManyToOne
	@JoinColumn(name = "ID")
	private Article article;

	public Long getArticleKeywordId() {
		return articleKeywordId;
	}

	public void setArticleKeywordId(Long articleKeywordId) {
		this.articleKeywordId = articleKeywordId;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
	
	public ArticleKeyword() {
	}

	public ArticleKeyword(String keyword, Article article) {
		super();
		this.keyword = keyword;
		this.article = article;
	}
}
