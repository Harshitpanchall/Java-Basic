package Constructor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		Date dob = sdf.parse("23-04-2003");
		System.out.println(dob);

		Person p = new Person("Harshit", "bhopal", 500000.00, dob);

		System.out.println("name : " + p.getName());
		System.out.println("address : " + p.getAddress());
		System.out.println("balance : " + p.getBalance());
		System.out.println("dob : " + p.getDob());

	}

}
