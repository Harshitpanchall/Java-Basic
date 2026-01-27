package com.in.rays.abstracts;

public class TestBusinessman {
	public static void main(String[] args) {
	
	Doctor d = new Doctor();
	
	d.study();
	d.marketing();
	
	System.out.println(d.getAge());
	System.out.println(d.getName());
	}

}
