package com.example.demo.the.cafe.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Contact {
	
	private String name;
	
	@Id
	private String mob;
	private String people;
	private String date;
	private String message;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(String name, String mob, String people, String date, String message) {
		super();
		this.name = name;
		this.mob = mob;
		this.people = people;
		this.date = date;
		this.message = message;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getPeople() {
		return people;
	}
	public void setPeople(String people) {
		this.people = people;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", mob=" + mob + ", people=" + people + ", date=" + date + ", message="
				+ message + "]";
	}
}
