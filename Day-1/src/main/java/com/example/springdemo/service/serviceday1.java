package com.example.springdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdemo.model.day1;
import com.example.springdemo.repository.day1repo;

@Service
public class serviceday1 {
	@Autowired
	 day1repo studRepository;
		
		public List<day1>  getyAllStudents() {
	    List<day1> studList=studRepository.findAll();
			return studList;
		}

	public day1 saveStudent(day1 s) {
		day1 obj=studRepository.save(s);
		return obj;
		//return studRepository.save(S);
	}
	//update
	/*public Student updateLaptop(Student s)
		{
			Student obj=Repository.save(s);
			return obj;
		}*/


	public day1 updateStudent(day1 s,int rno)
	{
		Optional<day1> optional= studRepository.findById(rno);
		day1 obj=null;
		if(optional.isPresent())
		{
			obj=optional.get();
			obj.setRegno(s.getRegno());
			obj.setName(s.getName());
			obj.setDep(s.getDep());
			obj.setEmail(s.getEmail());
			studRepository.saveAndFlush(s);
		}
		return obj;
		//return studRepository.save(s);
		
		
	}

}
