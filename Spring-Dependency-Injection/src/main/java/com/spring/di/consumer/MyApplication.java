package com.spring.di.consumer;

/*
 *@Component annotation is added to the class, so that when Spring framework will scan for the components, 
 *this class will be treated as component.@Component annotation can be applied only to the class and it’s retention policy is Runtime
 *
 *@Autowired annotation is used to let Spring know that autowiring is required. This can be applied to field, constructor and methods. 
 *This annotation allows us to implement constructor-based, field-based or method-based dependency injection in our components.
 */



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.spring.di.services.*;
@Component
public class MyApplication {
	private MessageServices service;
	@Autowired
	public void setService(MessageServices svc){
		this.service=svc;
	}

	public boolean processMessage(String msg, String rec){
		//some magic like validation, logging etc
		return this.service.sendMessage(msg, rec);
	}
}
