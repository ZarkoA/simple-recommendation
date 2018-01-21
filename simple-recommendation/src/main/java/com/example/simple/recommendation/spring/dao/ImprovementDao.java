package com.example.simple.recommendation.spring.dao;

import java.util.List;

import com.example.simple.recommendation.spring.entity.Improvement;

public interface ImprovementDao {

	void addImprovement(Improvement improvement);
	List<Improvement> listImprovements();
}
