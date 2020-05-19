package com.example.tetsfinal;

import java.util.ArrayList;
import java.util.List;

public class Employees {
	private List<Employee> emp;
	
	public List<Employee> getEmployees(){
		if(emp==null) {
			System.out.println("inside getemployee");
			emp=new ArrayList<Employee>();
		}
		return emp;
	}
	
	public void setEmployeeList(List<Employee> e) {
		System.out.println("inside setemployee");
		this.emp=e;
	}

}
