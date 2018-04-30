package com.componentscan.Beans;

import org.springframework.stereotype.Component;

import com.componentscan.Shape;
@Component
public class Triangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Triangle Drawn");		
	}



}
