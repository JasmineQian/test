package com.example.demo.controller;

import java.util.List;

import com.example.demo.pojo.News;
import com.example.demo.service.NewsService;
import com.example.demo.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/news")
public class NewsController {

	@Autowired
	private NewsService newsService;
	
	@GetMapping("/list")
	public Response list(int typeId) {
		List<News> newsList = newsService.queryNewsListByType(typeId);
		return Response.ok(newsList);

	}
	
	@GetMapping("/detail")
	public Response detail(int newsId) {
		News detail = newsService.queryNewsDetail(newsId);
		return Response.ok(detail);
	}
	
}
