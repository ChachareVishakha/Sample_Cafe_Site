package com.example.demo.the.cafe.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Login {

	private String name;
	private String email;
	@Id
	private String pass;
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(String name, String pass, String email) {
		super();
		this.name = name;
		this.pass = pass;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Login [name=" + name + ", pass=" + pass + ", email=" + email + "]";
	}
}
