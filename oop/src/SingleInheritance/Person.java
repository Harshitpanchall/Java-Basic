package SingleInheritance;

import java.util.Date;

public class Person { // student , hdfc expert class or person is superclass
	protected String name;
	protected String address;
	protected String dob;
	
	
	public String getName() {
		return name;
		
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public String getAddress() {
		return address;
	
	}
	
	public void setAddress(String address) {
		this.address = address;
		
	}
	
	public String getDob() {
		return dob;
		
	}
	
	public void setDob(String dob) {
		this.dob = dob;
	}

}
