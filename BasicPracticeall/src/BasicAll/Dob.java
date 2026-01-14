package BasicAll;

import java.time.LocalDate;
import java.util.Date;

public class Dob {
	public static void main(String[] args) {
		
		Date d = new Date();
		
		LocalDate now = LocalDate.now();
		System.out.println("Day Of tear : " + now.getDayOfYear());
		System.out.println("now : " + now);
		System.out.println("Day of Month " + now.getDayOfMonth());
		System.out.println("day of week : " + now.getDayOfWeek());
		
		
	}

}
