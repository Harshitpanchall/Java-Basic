package Date;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class LocaldateString {
	public static void main(String[] args) {
		
	
	Date d = new Date();
	System.out.println("current date :" + d);
	
	LocalDate now = LocalDate.now();
	LocalDate yesteraday = now.minusDays(1);
	LocalDate tomorrow = yesteraday.plusDays(2);
	
	System.out.println("now :" + now);
	System.out.println("minus : "+ yesteraday);
	System.out.println("tomorrow : " + tomorrow);
	
	}

	
}
