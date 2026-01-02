package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleFormat {

	public static void main(String[] args) {
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String s = sdf.format(date);
		System.out.println(s);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.dd.MM");
		String s1 = sdf1.format(date);
		System.out.println(s1);
		
	} 
}
