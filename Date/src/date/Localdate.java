package date;

import java.time.LocalDate;
import java.util.Date;

public class Localdate {
public static void main(String[] args) {
	
	Date date = new Date();
	System.out.println("current date : " + date);
	
	LocalDate now = LocalDate.now();
	LocalDate yesteraday = now.minusDays(1);
	LocalDate tomorrow = yesteraday.plusDays(2);
	
	System.out.println("now : " + now);
	System.out.println("yesteraday : "+ yesteraday);
	System.out.println("tomorrow : " + tomorrow);
	
}
}
