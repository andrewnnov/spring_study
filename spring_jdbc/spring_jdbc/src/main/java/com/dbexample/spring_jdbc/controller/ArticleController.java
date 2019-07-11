package com.dbexample.spring_jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbexample.spring_jdbc.entity.Article;
import com.dbexample.spring_jdbc.service.IArticleService;


@RestController
@RequestMapping("/api")
public class ArticleController {
	
	@Autowired
	private IArticleService articleService;
	
	
	@GetMapping("/articles")
	public ResponseEntity<List<Article>> getAllArticle() {
		
		List<Article> list = articleService.getAllArticles();
		
		return new ResponseEntity<List<Article>>(list, HttpStatus.OK);
		
	}

}
