package com.khadri.hibernate.identifiers.simple.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Student1")
@Table(name = "STUDENT_IDENTIFIER")
public class Student {

	@Id
	@Basic
	@GeneratedValue
	private int id;
	
	@Basic
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
