package com.tedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tedu.feigh.HelloFeigh;

@RestController
public class HelloController {
	@Autowired//注入feigh的接口
	private HelloFeigh helloFeigh;
	
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name) {
		//调用提供者
		return helloFeigh.hello(name);
		
		
	}

}
