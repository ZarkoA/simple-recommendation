package com.example.simple.recommendation.spring.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.simple.recommendation.spring.entity.Language;

@Repository
public class LanguageDaoImpl implements LanguageDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void add(Language language) {
		sessionFactory.getCurrentSession().save(language);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Language> listLanguages() {
		Query query = sessionFactory.getCurrentSession().createQuery("from Language");
		return query.list();
	}
}
