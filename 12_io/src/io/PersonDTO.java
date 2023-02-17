package io;

import java.io.Serializable;

public class PersonDTO implements Serializable{
	private String name;
	private int age;
	private double height;
	
	//내부적 LOMBOK
	public PersonDTO(String n, int a, double h) {
		super();
		this.name = n;
		this.age = a;
		this.height = h;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
}
