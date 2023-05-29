package com.example.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.springdemo.model.day3;
import com.example.springdemo.repo.day3repo;



@Service
public class day3service {
	@Autowired
	  day3repo studRepository;
	public List<day3> sortStudents(String field) {
		//return studRepository.findAll(Sort.by(field)); to return the table data in ascending order
		return studRepository.findAll(Sort.by(Direction.DESC,field));
	}

	/*public List<Student>fetchStudentsByDepartment(String dep,String name){
		
		return studRepository.getStudentsByDepartment(dep,name)


	}*/

	public List<day3>pagingStudents(int offset,int pageSize){
		
		Pageable paging=PageRequest.of(offset,pageSize);
		Page<day3>studData= studRepository.findAll(paging);	
		List<day3>studList=studData.getContent();
		return studList;
	}
	public List<day3>pagingSortingStudents(int offset,int pageSize,String field){
		
		Pageable paging=PageRequest.of(offset,pageSize).withSort(Sort.by(field));
		Page<day3>studData= studRepository.findAll(paging);	
		List<day3>studList=studData.getContent();
		return studList;
	}


}
