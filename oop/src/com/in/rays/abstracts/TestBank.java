package com.in.rays.abstracts;

public class TestBank {
	public static void main(String[] args) {
		
		Bank b = new AxisBank();
		b.fixrate();
		
		AxisBank a = new AxisBank();
		a.rate();
		a.highrate();
		
	}

}
