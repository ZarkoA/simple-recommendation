package com.example.simple.recommendation.spring.dao;

import java.util.List;

import com.example.simple.recommendation.spring.entity.Language;

public interface LanguageDao {

	void add(Language language);
	List<Language> listLanguages();
}
