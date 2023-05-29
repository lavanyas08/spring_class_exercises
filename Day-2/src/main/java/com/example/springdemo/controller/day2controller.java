package com.example.springdemo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.model.day2;
import com.example.springdemo.service.day2service;


@RestController
public class day2controller {
	day2service studService;
	
	//delete
		 @DeleteMapping(value="/deleteStudent/{rno}") 
		 public void  deleteStudent(@PathVariable("rno") int regno)
		 {
		 	studService.deleteStudent(regno);
		 }
		 //get by sno
		 @GetMapping(value="/getStudent/{rno}")
		 public day2 getStudent(@PathVariable("rno")  int regno)
		 {
		 	return studService.getStudent(regno);
		 }

}
