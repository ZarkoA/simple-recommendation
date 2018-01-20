package com.example.simple.recommendation.spring.entity;

import java.util.Date;

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

	@Column(name = "TITLE")
	private String title;
	
	@Column(name = "CATEGORY_ID")
	private String CategoryId;
	
	@Column(name = "PUBLISHING_DATE")
	private Date publishingDate;

	public String getArticleTitle() {
		return title;
	}

	public void setArticleTitle(String newArticleTitle) {
		title = newArticleTitle;
	}

	public Article() {
	}

	public Article(String articleTitle) {
		this.title = articleTitle;
	}
	
}
