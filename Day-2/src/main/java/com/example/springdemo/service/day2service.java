package com.example.springdemo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdemo.model.day2;
import com.example.springdemo.repo.day2repo;

@Service
public class day2service {
	
	@Autowired
	 day2repo studRepository;

public boolean deleteStudent(int regno) {
	boolean result=false;
	studRepository.deleteById(regno);
	Optional<day2> s= studRepository.findById(regno);
	if(s.isEmpty())
	{
		result=true;
	}
	return result;
}

public day2 getStudent(int regno)
{
	day2 s=studRepository.findById(regno).get();
	return s;
}

}
