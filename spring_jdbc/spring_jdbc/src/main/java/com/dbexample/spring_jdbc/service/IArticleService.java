package com.dbexample.spring_jdbc.service;

import java.util.List;


import com.dbexample.spring_jdbc.entity.Article;

public interface IArticleService {
	
	List<Article> getAllArticles();
    Article getArticleById(int articleId);
    boolean addArticle(Article article);
    void updateArticle(Article article);
    void deleteArticle(int articleId);

}
