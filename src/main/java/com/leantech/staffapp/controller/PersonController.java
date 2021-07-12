package com.leantech.staffapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.leantech.staffapp.model.Person;

import com.leantech.staffapp.repository.PersonRepository;

@RestController
public class PersonController {

 @Autowired
 private PersonRepository personRepository;
 
 @GetMapping("/person")
 public ResponseEntity<List<Person>> getPerson()
 {
	 List<Person> persons = new ArrayList<Person>();
	 try {
			personRepository.findAll().forEach(persons::add);
			if (persons.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		    }
			
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	 return new ResponseEntity<>(persons, HttpStatus.OK);
 }
 
 @GetMapping("/persons")
 public ResponseEntity<WrpPerson> getPersons()
 {
	 List<Person> persons = new ArrayList<Person>();
	 WrpPerson wrpEprson= new WrpPerson();
	 try {
			personRepository.findAll().forEach(persons::add);
			wrpEprson.setPersons(persons);
			wrpEprson.setTest("TEST");
			if (persons.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		    }
			
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	 return new ResponseEntity<>(wrpEprson, HttpStatus.OK);
 }
 //TEMP
}
