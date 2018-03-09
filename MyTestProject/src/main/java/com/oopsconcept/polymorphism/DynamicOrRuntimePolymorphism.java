package com.oopsconcept.polymorphism;
/*
 * Dynamic Polymorphism is the mechanism by which multiple methods can be defined 
 * with same name and signature in the superclass and subclass. 
 * The call to an overridden method are resolved at run time.
 */


public class DynamicOrRuntimePolymorphism {
	public static void main(String args[]) {
		Parent parent	= new Child();
		parent.nameOfClass();
	}
}

class Parent{
	public void nameOfClass() {
		System.out.println("This is parent class");
	}
}

class Child extends Parent{
	@Override
	public void nameOfClass() {
		System.out.println("This is child class");
	}
}
