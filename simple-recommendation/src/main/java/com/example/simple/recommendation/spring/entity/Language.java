package com.example.simple.recommendation.spring.entity;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LANGUAGE")
public class Language {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private long id;

	@Column(name = "LANGUAGE_KEY")
	private String LanguageKey;

	@Column(name = "DESCRIPTION")
	private String description;
	
	public String getLanguageKey() {
		return LanguageKey;
	}

	public void setLanguageKey(String LanguageKey) {
		this.LanguageKey = LanguageKey;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Language() {
	}

	public Language(String LanguageKey, String description) {
		this.LanguageKey = LanguageKey;
		this.description = description;
	}
}
