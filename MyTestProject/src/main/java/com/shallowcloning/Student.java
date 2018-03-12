package com.shallowcloning;
class Student implements Cloneable
{
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	int id;

	String name;

	Course course;

	public Student(int id, String name, Course course)
	{
		this.id = id;

		this.name = name;

		this.course = course;
	}


}