package com.example.demo.service.impl;

import com.example.demo.mapper.NewsMapper;
import com.example.demo.pojo.News;
import com.example.demo.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class NewsServiceImpl implements NewsService {
	

	@Autowired
	private NewsMapper newsMapper;


	@Override
	public List<News> queryNewsListByType(int typeId) {
		List<News> NewsListByType = newsMapper.getNewsListByTypeid(typeId);
		return NewsListByType;
	}

	@Override
	public News queryNewsDetail(int newsId) {
		News NewsDetail = newsMapper.getNewsByNewsId(newsId);
		return NewsDetail;
	}
}
