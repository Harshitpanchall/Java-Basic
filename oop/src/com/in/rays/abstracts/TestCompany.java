package com.in.rays.abstracts;

public class TestCompany {
	public static void main(String[] args) {
		
		Manager m = new Manager("Harshit Panchal",23, "Circle of area is 12.34");
		
		System.out.println(m.getAge());
		System.out.println(m.getName());
		m.companyrate();
		m.namecompany();
		m.roll();
		m.salary();
	
	}

}
