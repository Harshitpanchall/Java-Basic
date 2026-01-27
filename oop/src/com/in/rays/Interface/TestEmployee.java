package com.in.rays.Interface;

public class TestEmployee {
	public static void main(String[] args) {
		
		Database db = new Database();
		
		db.setAge(23);
		db.setName("harshit Panchal");
		db.setSalary(3400000);
		
		System.out.println("Age : "+db.getAge());
		System.out.println("Name : "+db.getName());
		System.out.println("Salary : "+db.getsalary());
		
		System.out.println(".........................................abstrcat and interface use ....................................");
		
		
		db.gatesecure();
		db.mangrol();
		db.nameproduct();
		db.product();
		db.productsecure();
	}

}
