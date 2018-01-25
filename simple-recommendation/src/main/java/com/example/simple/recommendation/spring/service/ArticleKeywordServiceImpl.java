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
	public int getArticleKeywordCount(long articleId) {
		return articleKeywordDao.getArticleKeywordCount(articleId);
	}

	@Transactional
	@Override
	public List<ArticleKeyword> listAllKeywords() {
		return articleKeywordDao.listAllKeywords();
	}

	@Transactional
	@Override
	public List<ArticleKeyword> listArticleKeywords(long articleId) {
		return articleKeywordDao.listArticleKeywords(articleId);
	}
}
