package in.co.rays.DateAndTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class simpleformat {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		String s = sdf.format(d);
		System.out.println(s);
		
		Date p = sdf.parse("25.06.2003 ");
		System.out.println("parser format : " + p); // parser to to convert the simpleformat date//
	
		
	}

}
