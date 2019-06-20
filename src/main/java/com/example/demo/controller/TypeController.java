package com.example.demo.controller;

import java.util.List;

import com.example.demo.pojo.Type;
import com.example.demo.service.TypeService;
import com.example.demo.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/type")
public class TypeController {

	@Autowired
	private TypeService typeService;
	
	@GetMapping("/all")
	public Response all() {
		List<Type> allTypes = typeService.queryAllTypes();
		return Response.ok(allTypes);
	}
	
}
