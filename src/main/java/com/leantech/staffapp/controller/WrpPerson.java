package com.leantech.staffapp.controller;
import java.util.List;

import com.leantech.staffapp.model.Person;

public class WrpPerson {
	
	private String test;
	private List<Person> persons;
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public List<Person> getPersons() {
		return persons;
	}
	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

}
