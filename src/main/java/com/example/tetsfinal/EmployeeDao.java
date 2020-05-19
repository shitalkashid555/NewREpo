package com.example.tetsfinal;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
private static Employees list=new Employees();

static {
	list.getEmployees().add(new Employee(1, "shital", "shitalkashid@gmail.com"));
	list.getEmployees().add(new Employee(2, "shubhangi", "shubhangikashid@gmail.com"));
	list.getEmployees().add(new Employee(3, "mangesh", "mangeshkashid@gmail.com"));
	list.getEmployees().add(new Employee(4, "sangita", "sangitakashid@gmail.com"));
	list.getEmployees().add(new Employee(5, "Anurath", "Anurathkashid@gmail.com"));
}

public Employees getAllEmployees() {
	System.out.println("inside empdaos getallemployees");
	return list;
}

public boolean addEmployee(Employee e) {
	list.getEmployees().add(e);
	System.out.println("add employee");
	return true;
}
}
