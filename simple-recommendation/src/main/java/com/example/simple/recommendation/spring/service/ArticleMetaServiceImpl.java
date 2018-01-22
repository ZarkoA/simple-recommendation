package com.example.simple.recommendation.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.simple.recommendation.spring.dao.ArticleMetaDao;
import com.example.simple.recommendation.spring.entity.ArticleMeta;

@Service
public class ArticleMetaServiceImpl implements ArticleMetaService {

	@Autowired
	private ArticleMetaDao improvementDao;
	
	@Transactional
	@Override
	public void addImprovement(ArticleMeta improvement) {
		improvementDao.addImprovement(improvement);
	}

	@Transactional
	@Override
	public List<ArticleMeta> listImprovements() {
		return improvementDao.listImprovements();
	}

}
