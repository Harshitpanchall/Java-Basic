package SingleInheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		
		Person p = new Person();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		Date d = sdf.parse("23.04.1973");// string - date - parse
		String a = sdf.format(d); // date - string - format
	
		p.setAddress("Bhopal");
		p.setDob(a);
		p.setName("Harshit");
		
		System.out.println("name : " + p.getName());
		System.out.println("address : " + p.getAddress());
		System.out.println("Date : " + p.getDob());
		
		Student s = new Student();
		s.setEnrollment(23);
		s.setPhoto(2);
		
		System.out.println("enrollment : " + s.getEnrollment());
		System.out.println("photo : " + s.getPhoto());
	}

}
