package com.spring.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.spring.beans.MyBean;

@Configuration
public class MyConfiguration {
	
	@Bean
	@Scope(value="prototype")
    public MyBean myBean() {
		return new MyBean();
	}
	
}