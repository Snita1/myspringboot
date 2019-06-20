package com.javainuse.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Users {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	
	public Users() {

    }

	public Users(String name, String dept) {
		super();
	//	this.id = id;
		this.name = name;
		this.dept = dept;
	}

	public Users(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	private String dept;

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
	

}
