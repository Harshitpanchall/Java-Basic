package in.co.rays.DateAndTime;

import java.time.LocalDate;

public class testlocalnowyeaterdaytomorrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate now = LocalDate.now();
		LocalDate yesteraday = now.minusDays(1);
		LocalDate tomorrow = yesteraday.plusDays(2);
		
		System.out.println("now : " + now);
		System.out.println("yesterdays  :" + yesteraday);
		System.out.println("tomorrow : " + tomorrow);
		

	}

}
