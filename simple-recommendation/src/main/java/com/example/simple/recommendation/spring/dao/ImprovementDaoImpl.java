package com.example.simple.recommendation.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.simple.recommendation.spring.entity.Improvement;

@Repository
public class ImprovementDaoImpl implements ImprovementDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addImprovement(Improvement improvement) {
		sessionFactory.getCurrentSession().save(improvement);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Improvement> listImprovements() {
		return sessionFactory.getCurrentSession().createQuery("from Improvement").list();
	}
}
