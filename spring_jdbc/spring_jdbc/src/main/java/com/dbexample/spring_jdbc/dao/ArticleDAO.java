package com.dbexample.spring_jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dbexample.spring_jdbc.entity.Article;
import com.dbexample.spring_jdbc.entity.ArticleRowMapper;


@Transactional
@Repository
public class ArticleDAO implements IArticleDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Article> getAllArticles() {
		String sql = "Select articleId, title, category From articles";
		RowMapper<Article> rowMapper = new ArticleRowMapper();
		return jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public Article getArticleById(int articleId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addArticle(Article article) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateArticle() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteArticle() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean articleExists(String title, String category) {
		// TODO Auto-generated method stub
		return false;
	}

}
