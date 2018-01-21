package com.example.simple.recommendation.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.simple.recommendation.spring.dao.ImprovementDao;
import com.example.simple.recommendation.spring.entity.Improvement;

@Service
public class ImprovementServiceImpl implements ImprovementService {

	@Autowired
	private ImprovementDao improvementDao;
	
	@Transactional
	@Override
	public void addImprovement(Improvement improvement) {
		improvementDao.addImprovement(improvement);
	}

	@Transactional
	@Override
	public List<Improvement> listImprovements() {
		return improvementDao.listImprovements();
	}

}
