package com.dbexample.spring_jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

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
	
	@GetMapping("/article/{id}")
	public ResponseEntity<Article> getArticleById(@PathVariable("id") Integer id) {
		Article article = articleService.getArticleById(id);
		return new ResponseEntity<Article>(article, HttpStatus.OK);
	}
	
	
	@PostMapping("/article")
	public ResponseEntity<Void> addArticle(@RequestBody Article article, UriComponentsBuilder builder) {
		boolean flag = articleService.addArticle(article);
		if(flag == false) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/article/{id}").buildAndExpand(article.getArticleId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

}
