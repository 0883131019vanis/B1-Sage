package io.javasagedemo.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloTeamController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "hello team ";
	}
	

}

//get put post delete patch 
//The @RequestMapping maps only to Get method by default. 
//To map to other HTTP methods, you'll have to specify it in annotation

