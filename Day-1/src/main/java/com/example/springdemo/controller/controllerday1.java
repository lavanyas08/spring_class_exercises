package com.example.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.model.day1;
import com.example.springdemo.service.serviceday1;

@RestController
public class controllerday1 {
	@Autowired
	serviceday1 studService;
	//get all the table details
	@GetMapping(value="fetchStudents")
	public List<day1> getAllStudents() {
		List<day1> studList=studService.getyAllStudents();
		return studList;
	}
	
	//post
	@PostMapping(value="/saveStudent")
	public day1 saveStudent(@RequestBody day1 s)
	{
		return studService.saveStudent(s);
	}
	//update
	@PutMapping(value="/updateStudent/{rno}")
	 public day1 updateStudent(@RequestBody day1 s,@PathVariable int rno) 
		{
			return studService.saveStudent(s);
			
		}

}
