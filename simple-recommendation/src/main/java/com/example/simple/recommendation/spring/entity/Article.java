package com.example.simple.recommendation.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ARTICLE")
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "ARTICLE_TITLE")
	private String articleTitle;

	public String getArticleTitle() {
		return articleTitle;
	}

	public void setArticleTitle(String newArticleTitle) {
		articleTitle = newArticleTitle;
	}

	public Article() {}

	public Article(String articleTitle) {
	      this.articleTitle = articleTitle;
	   }
}
