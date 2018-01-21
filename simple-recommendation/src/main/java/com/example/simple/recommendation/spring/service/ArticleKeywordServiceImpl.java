package com.example.simple.recommendation.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.simple.recommendation.spring.dao.ArticleKeywordDao;
import com.example.simple.recommendation.spring.entity.ArticleKeyword;

@Service
public class ArticleKeywordServiceImpl implements ArticleKeywordService {

	@Autowired
	private ArticleKeywordDao articleKeywordDao;
	
	@Transactional
	@Override
	public void addArticleKeyword(ArticleKeyword articleKeyword) {
		articleKeywordDao.addArticleKeyword(articleKeyword);
	}

	@Transactional
	@Override
	public List<ArticleKeyword> listArticleKeywords() {
		return articleKeywordDao.listArticleKeywords();
	}
}
