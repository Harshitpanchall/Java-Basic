package in.co.rays.DateAndTime;

import java.time.LocalDate;

public class TestLocaldate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		LocalDate now = LocalDate.now();
		
		System.out.println("Localnow : " + now);
		System.out.println("dayofweek : " + now.getDayOfWeek());
		System.out.println("dayof Year : " + now.getDayOfYear());
		System.out.println("dayofmonth : "  + now.getDayOfMonth());
		System.out.println("year : " + now.getYear());
		
		System.out.println("Month : " + now.getMonth());
		

	}


}
