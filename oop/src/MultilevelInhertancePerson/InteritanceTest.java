package MultilevelInhertancePerson;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class InteritanceTest extends InheritanceStudent {
	
	public static void main(String[] args) throws ParseException {
		
		InheritanceStudent is = new InheritanceStudent();
		
		is.setRoll("234");
		is.setMarks(23);
		
		System.out.println("roll no : " + is.getRollno());
		System.out.println("marks :" + is.getMarks());
		
		System.out.println(".........................................");
		
		
		InheritanceBusinessman ib = new InheritanceBusinessman();
		
		ib.setIncome(100000000000000000.00);
		System.out.println( "income : " + ib.getIncome());
		
		System.out.println("...........................................");
		
		
		InheritanceDoctor id = new InheritanceDoctor();
		
		id.setRegistration("2345432343234");
		System.out.println("registration : " + id.getRegistration());
		
		System.out.println("..............................................");
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy G 'at' hh:mm:ss:SS");
	
		Date d = new Date();
		InheritanceMutliPerson ip = new InheritanceMutliPerson();
		
		ip.setAddress("Indore Madhya Pradesh");
		ip.setName("Harshit Panchal");
		ip.setDob(d);
		
		System.out.println("Address : "+ ip.getAddress());
		System.out.println("Name : "+ ip.getName());
		System.out.println("Date : " +ip.getDob());
		
		
		
		
		
		
		
		
		
		
	}

}
