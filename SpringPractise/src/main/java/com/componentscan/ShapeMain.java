package com.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.componentscan.Beans.Circle;
import com.componentscan.Beans.Triangle;
@ComponentScan
public class ShapeMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ShapeMain.class);
		Circle obj = ctx.getBean(Circle.class);
		obj.draw();
		Triangle obj1 = ctx.getBean(Triangle.class);
		obj1.draw();


	}

}
