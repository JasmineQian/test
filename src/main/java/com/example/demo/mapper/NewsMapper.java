package com.example.demo.mapper;


import com.example.demo.pojo.News;

import java.util.List;

public interface NewsMapper {

    List<News> getAllNews();

    List<News> getNewsListByTypeid(int typeId);

    News getNewsByNewsId(int id);

    int insert(News news);

    int update(News  news);
}