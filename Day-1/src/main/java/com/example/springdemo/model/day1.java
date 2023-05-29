package com.example.springdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class day1 {
	@Id
	 private int regno;
	 private String name;
	 private String dep;
	 private String email;
	 public int  getRegno() {
			return regno;
	}
	public void setRegno(int regno) {
			this.regno = regno ;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
