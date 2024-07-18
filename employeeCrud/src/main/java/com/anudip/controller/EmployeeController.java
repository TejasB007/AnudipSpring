package com.anudip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anudip.entity.Employee;
import com.anudip.serviceimplementation.EmployeeServiceImpl;

//postman will send the request through http protocall


@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl service;
	@PostMapping("/addEmp1")
	public Employee empAdd(@RequestBody Employee emp) {
		
		return service.addEmployee(emp);
		
	}

}
