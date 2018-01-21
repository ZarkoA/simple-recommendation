package com.example.simple.recommendation.spring.service;

import java.util.List;

import com.example.simple.recommendation.spring.entity.Improvement;

public interface ImprovementService {
	
	void addImprovement(Improvement improvement);
	List<Improvement> listImprovements();
}
