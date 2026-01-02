package Java_oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		Person p = new Person();

		p.setName("harshit");
		p.setAddress("bhopal");
		p.setDob(sdf.parse("23-04-2003"));

		System.out.println("name : " + p.getName());
		System.out.println("addres : " + p.getAddress());
		System.out.println("Date : " + p.getDob());

	}

}
