package com.in.rays.abstracts;

public class Manager extends Company implements Employee{

	public String area;
	
	public Manager(String name, int age, String area) {
		super(name, age);
		this.area = area;
		
	}

	@Override
	public void salary() {
		System.out.println("2300000000");
		
	}

	@Override
	public void roll() {
		System.out.println("roll : "+"101");
		
	}

	@Override
	public void namecompany() {
		System.out.println("NameCompany :"+"group of industry pvt lmt");
		
	}

	@Override
	public void companyrate() {
		System.out.println("Companyrate : "+"23.3");
		
	}

}
