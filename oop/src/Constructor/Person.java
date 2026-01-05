package Constructor;

import java.util.Date;

public class Person {
	private String name;
	private String address;
	private double balance;
	private Date dob;

	public Person(String n, String a, double b, Date d) {
		this.name = n;
		this.address = a;
		this.balance = b;
		this.dob = d;

	}

	public String getName() {
		return name;

	}

	public String getAddress() {
		return address;

	}

	public double getBalance() {
		return balance;

	}

	public Date getDob() {
		return dob;

	}

}
