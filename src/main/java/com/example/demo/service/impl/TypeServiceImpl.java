package com.example.demo.service.impl;

import com.example.demo.mapper.TypeMapper;
import com.example.demo.pojo.Type;
import com.example.demo.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TypeServiceImpl implements TypeService {
	
	@Autowired
	private TypeMapper typeMapper;
	
	@Override
	public List<Type> queryAllTypes() {
		List<Type> lists = typeMapper.getAllTypes();
		return lists;
	}

}
