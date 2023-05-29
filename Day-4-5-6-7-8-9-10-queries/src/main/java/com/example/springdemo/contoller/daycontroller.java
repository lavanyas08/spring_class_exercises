package com.example.springdemo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.model.day;
import com.example.springdemo.repo.dayrepo;

@RestController
public class daycontroller {
	@Autowired
	dayrepo studService;
	 @GetMapping("/fetchStudentsByNamePrefix")
		public List<day> fetchStudentsByNamePrefix(@RequestParam String prefix){
			return studService.fetchStudentsByNamePrefix(prefix);
		}
		//http://localhost:8080/fetchStudentByDepartment/dep/name
		@GetMapping("/fetchStudentsByDepartment/{dept}/{name}")
		 public List<day> fetchStudentByDepartment(@PathVariable String dept,@PathVariable String name){
			return studService.getStudentByDepartment(dept, name);
}
		 
		@GetMapping("/query")
		    public List<day>fetchqueryStudent(@RequestParam String dept,@RequestParam String name )
		    {
		    	return studService.queryStudent(dept, name);
		    }
		    @GetMapping("/query2")
		    public List<day>fetchqueryByStudents(@RequestParam String dept )
		    {
		    	return studService.queryStudents(dept);
		    }
	 
	

}
