package com.leantech.staffapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leantech.staffapp.model.Employee;
import com.leantech.staffapp.model.Person;
import com.leantech.staffapp.repository.EmployeeRepository;

@RestController
public class EmployeeControler {
	
	 @Autowired
	 private EmployeeRepository employeeRepository;
	

	 @GetMapping("/employee")
	 public ResponseEntity<List<Employee>> getPerson()
	 {
		 List<Employee> employees = new ArrayList<Employee>();
		 try {
			 employeeRepository.findAll().forEach(employees::add);
				if (employees.isEmpty()) {
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			    }
				
			} catch (Exception e) {
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		 return new ResponseEntity<>(employees, HttpStatus.OK);
	 }
}
