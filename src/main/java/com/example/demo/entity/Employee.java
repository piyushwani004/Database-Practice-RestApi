package com.example.demo.entity;

import javax.persistence.Entity;

@Entity
public class Employee {

	@javax.persistence.Id
	private long Id;
	private String Name;
	private String Dept;
	private double Salary;

	public Employee(long id, String name, String dept, double salary) {
		super();
		Id = id;
		Name = name;
		Dept = dept;
		Salary = salary;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", Dept=" + Dept + ", Salary=" + Salary + "]";
	}
	
	

}
