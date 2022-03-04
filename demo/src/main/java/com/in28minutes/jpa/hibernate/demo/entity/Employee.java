package com.in28minutes.jpa.hibernate.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "select all", query = "Select e From Employee e")
public class Employee {
	@GeneratedValue
	@Id
	private int id;
	private String name;
	private String designation;
	private long salary;
	
	protected Employee() {
	
}
	
	public Employee(String name, String designation, long salary){
	super();
	this.name = name;
	this.designation  = designation;
	this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
	
}