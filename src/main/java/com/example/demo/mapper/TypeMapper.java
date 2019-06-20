package com.example.demo.mapper;

import com.example.demo.pojo.Type;

import java.util.List;

public interface TypeMapper {

    List<Type> getAllTypes();

    Type type(int id);

    int insert(Type type);

    int update(Type type);
}