package com.spring.autowire.byType;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.model.Employee;

public class EmployeeAutowiredByTypeService {

	//Autowired annotation on variable/setters is equivalent to autowire="byType"
	@Autowired
	private Employee employee;
	
	@Autowired
	public void setEmployee(Employee emp){
		this.employee=emp;
	}
	
	public Employee getEmployee(){
		return this.employee;
	}
}