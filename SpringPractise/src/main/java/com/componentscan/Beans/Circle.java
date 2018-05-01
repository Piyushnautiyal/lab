package com.componentscan.Beans;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.componentscan.Shape;

@Component
public class Circle  implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle Drawn");		
	}


}
