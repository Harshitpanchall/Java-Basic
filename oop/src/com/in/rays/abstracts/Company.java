package com.in.rays.abstracts;

public abstract class Company {
	
	String name;
	int age;
	
	public Company(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public String getName() {
		return name;
		
	}
	
	public int getAge() {
		return age;
		
	}
	
	public abstract void salary();
	
	public abstract void roll();
	

}
