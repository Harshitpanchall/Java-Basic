package Date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;

public class DateOfBirth {
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-DD");
		String d = sdf.format(2003-06-25);
		System.out.println(d);
		
		LocalDate now = LocalDate.now();
		String name = "HarshitPanchal";
		
		System.out.println("now Dob :" + now);
		System.out.println("Date of Year :"+ now.getDayOfYear());
		System.out.println("Day of Week : " + now.getDayOfWeek());
		System.out.println("year :" + now.getYear());
		System.out.println("Week : " + now.getMonthValue());
		System.out.println("Name :" + name);
		System.out.println("Name length :"+ name.length());
				
	}

}
