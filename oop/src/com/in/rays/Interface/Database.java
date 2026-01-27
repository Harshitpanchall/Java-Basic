package com.in.rays.Interface;

public class Database extends Employee implements Manager , Security{

	@Override
	public void productsecure() {
		System.out.println("manger in real project for secure");
		
	}

	@Override
	public void gatesecure() {
		System.out.println("security guard");
		
	}

	@Override
	public void mangrol() {
		System.out.println("manger design role");
		
	}

	@Override
	public void product() {
		System.out.println("jar in mechanical");
		
	}

	@Override
	public void nameproduct() {
		System.out.println("company compiler design role in name");
		
	}

}
