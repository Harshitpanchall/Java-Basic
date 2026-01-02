package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimplePattern {
public static void main(String[] args) {
	
	Date date = new Date();
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
	String s = sdf.format(date);
	System.out.println(s);
	
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.dd.MM G 'at' hh:mm:ss a");
	String s1 = sdf1.format(date);
	System.out.println(s1);
	
	SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm aaa");
	String s2 = sdf2.format(date);
	System.out.println(s2);
	
	SimpleDateFormat sdf3 = new SimpleDateFormat("k:mm a,z");
	String s3 = sdf3.format(date);
	System.out.println(s3);;
	
	SimpleDateFormat sdf4 = new SimpleDateFormat("hh:mm a");
	String s4 = sdf4.format(date);
	System.out.println(s4);
	
}
}
