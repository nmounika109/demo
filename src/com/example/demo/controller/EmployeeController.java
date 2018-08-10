package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@PostMapping("/insertEmployee")
	public Employee insertEmployee(@RequestBody Employee e) {
		
		employeeRepository.save(e);
		
		Employee emp = e;
		
		return emp;
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public Boolean deleteEmployee(@PathVariable Integer id) {
		
		
		employeeRepository.deleteById(id);
		
		return true;
		
		
	}
	
}
