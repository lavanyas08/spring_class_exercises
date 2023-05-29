package com.example.springdemo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.springdemo.model.day;

public interface dayrepo extends JpaRepository<day,Integer> {
	
	//native query
		//@Query("select s from Student s where s.dep=?1 and s.name=?2 nativeQuery=true")
		//positional parameter
		@Query("select s from day s where s.dep=?1 and s.name=?2")
		public List<day>getStudentByDepartment(String dep,String name);
		
		//named parameter
		@Query("select s from day s where s.dep=:dept")
		public List<day>getStudentByDepartment(String dept);
		
		//DML query
		//select query
		@Modifying
		@Query("delete from day s  where s.dep=?1")
		public int deleteStudentByDepartment(String dep);
		
		@Modifying
		@Query("update day s set s.dep=?1 where s.name=?2")
		public int UpdateStudentByName(String dep,String name);
		
//		@Query(value="select * from Student  s where  s.email= ?1",  nativeQuery=true)
//		public List<Student> fetchStudentByMail(String  email);
		List<day> findByNameStartingWith(String prefix);
		List<day> findByNameEndingWith(String suffix);
		List<day> findBydep(String dep);

		public List<day> queryStudents(String dept);

		public List<day> queryStudent(String dept, String name);

		public List<day> fetchStudentsByNamePrefix(String prefix);

}
