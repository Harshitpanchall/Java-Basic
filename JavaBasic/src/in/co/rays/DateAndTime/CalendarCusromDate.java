package in.co.rays.DateAndTime;

import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CalendarCusromDate {
	public static void main(String[] args) throws ParseException {
	
		String name = "23-03-20003";
		
		SimpleDateFormat  sdf = new SimpleDateFormat("dd-MM-yyyyy");
		
		Date s = sdf.parse(name);
		
	Calendar cal = Calendar.getInstance();
	
	cal.setTime(s);
	
		int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);
		
		cal.add(Calendar.DATE, 30);
		
		Date nextEvent = cal.getTime();
		
		
	
		
		
	}

}
