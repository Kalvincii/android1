package com.example.robospicev1.model;


import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;


public class Example {

	@Expose
	private List<Employee> employee = new ArrayList<Employee>();

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

}