package com.anudip.service;

import com.anudip.entity.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee emp);
	
	public Employee getEmployee(int id);
	
	public String deleteEmployee();
	
	public Employee updateEmployee(int id);
}
