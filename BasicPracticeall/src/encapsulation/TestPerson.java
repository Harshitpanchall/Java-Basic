package encapsulation;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
	public static void main(String[] args) {
		
		Person p  = new Person();
		
	Date d = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("DD.MM.YYYY");
//	System.out.println("Date of dob :" + d);
	p.setName("Harshit Panchal");
	p.setAddress("Indore");
	p.setDob(d);
	
	System.out.println("Name : " + p.getName());
	System.out.println("address : "+ p.getAddress());
	System.out.println("Date dob : " + p.getDob());
	
	
	
	
	}

}
