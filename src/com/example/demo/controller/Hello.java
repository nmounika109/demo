package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Map<String, String> welcome() {
		System.out.println("hello mappings");
		
		Map m = new HashMap();
		m.put("1", "Mahesh");
		m.put("2", "Suresh");
		m.put("3", "Ramesh");
		m.put("4", "Naresh");
		return m;
	}
	
	@PostMapping(value="/")
	public Map<String, String> welcome1() {
		System.out.println("hello mappings");
		
		Map m = new HashMap();
		m.put("1", "Mahesh");
		m.put("2", "Suresh");
		m.put("3", "Ramesh");
		return m;
	}
	
	@PutMapping(value="/")
	public Map<String, String> welcome2() {
		System.out.println("hello mappings");
		
		Map m = new HashMap();
		m.put("1", "Mahesh");
		m.put("2", "Suresh");
		return m;
	}
	
	@DeleteMapping(value="/")
	public Map<String, String> welcome3() {
		System.out.println("hello mappings");
		
		Map m = new HashMap();
		m.put("1", "Mahesh");
		return m;
	}
	
}
