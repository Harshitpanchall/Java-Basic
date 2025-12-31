package ControlStatement;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ForLoopJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		System.out.println("Current : " + d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYY-MM-DD");
		String s = sdf.format(d);
		System.out.println("format : " + s);
		
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("for Loop To 10 : " + i);
		}
		

	}

	

}
