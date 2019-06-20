package com.example.demo.service;

import com.example.demo.pojo.News;

import java.util.List;

public interface NewsService {

    //根据分类查询新闻列表
    List<News> queryNewsListByType(int typeId);

    // 根据新闻id查询指定的新闻内容详情
    News queryNewsDetail(int newsId);
}
