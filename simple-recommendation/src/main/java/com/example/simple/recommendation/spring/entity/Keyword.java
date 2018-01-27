package com.example.simple.recommendation.spring.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(
		name = "KEYWORD", 
		uniqueConstraints = @UniqueConstraint(columnNames={"KEYWORD", "LANGUAGE_KEY"}))
public class Keyword {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true)
	private Long keywordId;
	
	@Column(name = "KEYWORD")
	private String keyword;
	
	@OneToOne
	@JoinColumn(name = "LANGUAGE_KEY", nullable = false)
	private Language language;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name="ARTICLE_KEYWORD", 
			joinColumns = @JoinColumn(name = "KEYWORD_ID"), 
			inverseJoinColumns = @JoinColumn(name = "ARTICLE_ID"))  
	private List<Article> articles;
	

	public Long getKeywordId() {
		return keywordId;
	}

	public void setKeywordId(Long keywordId) {
		this.keywordId = keywordId;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	
	public Keyword() {
	}
	
	public Keyword(String keyword, Language language) {
		this.keyword = keyword;
		this.language = language;
	}
	
	public Keyword(String keyword, String languageKey) {
		this.keyword = keyword;
	}

	public Keyword(String keyword, List<Article> articles) {
		this.keyword = keyword;
		this.articles = articles;
	}
}
