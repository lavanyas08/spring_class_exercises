package com.example.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.example.springdemo.model.day3;
import com.example.springdemo.service.day3service;

@RestController
public class day3controller {
	
	@Autowired
	day3service studService;
	 @GetMapping("/sortStudent/{field}")
	 public List<day3>sortStudent(@PathVariable String field) 
	 {
		 return studService.sortStudents(field);
	 }
	 
	 //paging
	 @GetMapping("/pagingStudents/{offset}/{pageSize}")
	 public List<day3>pagingStudents(@PathVariable int offset,@PathVariable int pageSize) 
	 {
		 return studService.pagingStudents(offset,pageSize);
	 }
	 
	 //paging&&sorting
	
		 @GetMapping("/pagingStudents/{offset}/{pageSize}/{field}")
		 public List<day3>pagingSortingStudents(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field) 
		 {
			 return studService.pagingSortingStudents(offset,pageSize,field);
		 }
		 

}
