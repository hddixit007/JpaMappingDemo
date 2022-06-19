package com.jpaMap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpaMap.model.Employee;
import com.jpaMap.repository.EmployeeRepository;

@RestController
@RequestMapping("employee")
public class EmployeeController {

	@Autowired
	private EmployeeRepository empRepository;
	
	@PostMapping("/saveEmployees")
	public ResponseEntity<String> saveEmployees(@RequestBody List<Employee> empData) {
		empRepository.saveAll(empData);
		return ResponseEntity.ok("Data Saved");
		
	}
	
	@GetMapping("/getEmployees")
	public List<Employee> getEmployees() {
		return empRepository.findAll();
	}
	@GetMapping("/get")
	public String get() {
		return "asgafgaj";
	}
}
