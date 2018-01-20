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
@Table(name = "IMPROVEMENT")
public class Improvement {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true)
	private long improvementId;
	
	@Column
	private String languageKey;
	
	@Column
	private long contentLength;
	
	@Column
	private int contentKeywordNumber;
	
	@Column
	private int descriptionKeywordNumber;
	
	@OneToOne
	@JoinColumn(name = "ID")
	private Category category;

	public long getImprovementId() {
		return improvementId;
	}

	public void setImprovementId(long improvementId) {
		this.improvementId = improvementId;
	}

	public String getLanguageKey() {
		return languageKey;
	}

	public void setLanguageKey(String languageKey) {
		this.languageKey = languageKey;
	}

	public long getContentLength() {
		return contentLength;
	}

	public void setContentLength(long contentLength) {
		this.contentLength = contentLength;
	}

	public int getContentKeywordNumber() {
		return contentKeywordNumber;
	}

	public void setContentKeywordNumber(int contentKeywordNumber) {
		this.contentKeywordNumber = contentKeywordNumber;
	}

	public int getDescriptionKeywordNumber() {
		return descriptionKeywordNumber;
	}

	public void setDescriptionKeywordNumber(int descriptionKeywordNumber) {
		this.descriptionKeywordNumber = descriptionKeywordNumber;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}
