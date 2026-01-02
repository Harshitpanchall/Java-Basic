package in.co.rays.DateAndTime;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StringToDateJava {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		String name = "25-06-2003";
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date d = sdf.parse(name);
//		String s = sdf.format(d);
//		System.out.println(s);
		System.out.println(d);

	}

}
