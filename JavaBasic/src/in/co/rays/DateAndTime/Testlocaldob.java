package in.co.rays.DateAndTime;

import java.time.LocalDate;

public class Testlocaldob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate dob = LocalDate.of(2026, 12, 25);
		System.out.println("now : " + dob);
		System.out.println("day of week : " + dob.getDayOfWeek());
		System.out.println("Day of Month : " + dob.getDayOfMonth());
		System.out.println("Day of Year : " + dob.getDayOfYear());
		System.out.println("year : " + dob.getYear());
		System.out.println("Month : " + dob.getMonth());
		
		

	}

}
