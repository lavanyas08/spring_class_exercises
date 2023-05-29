package com.example.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdemo.model.day;
import com.example.springdemo.repo.dayrepo;

@Service
public class dayservice {
	@Autowired
	dayrepo studRepository;
	public List<day> fetchStudentsByNamePrefix(String prefix){
		return studRepository.findByNameStartingWith(prefix);
	}


	public List<day>getStudentByDepartment(String dep,String name)
	{
		return studRepository.getStudentByDepartment(dep,name);
	}

	public List<day> queryStudents(String dep) {
		// TODO Auto-generated method stub
		return studRepository.getStudentByDepartment(dep);
	}

	public List<day> queryStudent(String dep, String name) {
		return studRepository.getStudentByDepartment(dep,name);
	}



}
