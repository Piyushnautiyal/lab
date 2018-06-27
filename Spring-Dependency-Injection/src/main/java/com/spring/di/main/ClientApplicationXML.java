package com.spring.di.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.di.consumer.MyXMLApplication;

public class ClientApplicationXML {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
			"applicationContext.xml");
	
	//MyXMLApplication app = (MyXMLApplication) context.getBean("MyXMLApp");
	MyXMLApplication app = context.getBean(MyXMLApplication.class);
	app.processMessage("Hi Pankaj", "pankaj@abc.com");

	// close the context
	context.close();
}
}
