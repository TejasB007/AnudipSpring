package com.anudip.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudip.entity.Employee;
import com.anudip.repository.EmployeeRepository;
import com.anudip.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository empRepository;
	
	@Override
	public Employee addEmployee(Employee emp) {
		
		empRepository.save(emp);	
		return emp;
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
