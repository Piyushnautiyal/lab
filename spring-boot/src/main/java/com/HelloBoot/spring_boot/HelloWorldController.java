package com.HelloBoot.spring_boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/")
	   public String sayHello() {
	      return "Hello Spring Boot!!";
	   }

}
