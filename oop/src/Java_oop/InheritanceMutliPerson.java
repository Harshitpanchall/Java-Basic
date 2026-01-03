package Java_oop;

import java.util.Date;

public class InheritanceMutliPerson {
	
	protected String name;
	protected String address;
	protected Date dob;
	
	public String getName() {
		return this.name;
		
		}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public String getAddress() {
		return this.address;
		
	}
	
	public void setAddress(String address) {
		this.address = address;
		
	}
	
	public Date getDob() {
		return this.dob;
		
	}
	
	public void setDob(Date dob) {
		this.dob = dob;
		
	}

}
