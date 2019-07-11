package com.dbexample.spring_jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbexample.spring_jdbc.dao.IArticleDAO;
import com.dbexample.spring_jdbc.entity.Article;

@Service
public class ArticleService implements IArticleService {
	
	@Autowired
	private IArticleDAO articleDAO;

	@Override
	public List<Article> getAllArticles() {
		
		return articleDAO.getAllArticles();
	}

	@Override
	public Article getArticleById(int articleId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addArticle(Article article) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateArticle(Article article) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteArticle(int articleId) {
		// TODO Auto-generated method stub
		
	}
	
	

}
