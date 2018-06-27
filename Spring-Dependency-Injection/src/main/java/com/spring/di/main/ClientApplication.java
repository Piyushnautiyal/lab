package com.spring.di.main;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.di.configurations.DIConfiguration;
import com.spring.di.consumer.MyApplication;

/*
 * AnnotationConfigApplicationContext is the implementation of AbstractApplicationContext abstract class and 
 * it’s used for autowiring the services to components when annotations are used. 
 * AnnotationConfigApplicationContext constructor takes Class as argument 
 * that will be used to get the bean implementation to inject in component classes.
 */

public class ClientApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
		MyApplication app = context.getBean(MyApplication.class);
		
		app.processMessage("Hi Pankaj", "pankaj@abc.com");
		
		//close the context
		context.close();
	}

}