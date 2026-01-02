package in.co.rays.DateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class sdfpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		String s = sdf.format(d);
		System.out.println(s);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyy.MM.dd.G 'at' hh:mm:ss a");
		String s1 = sdf1.format(d);
		System.out.println(s1);
		
		SimpleDateFormat fdd = new SimpleDateFormat("h:mm a");
		String s3 = fdd.format(d);
		System.out.println(s3);
		
		SimpleDateFormat sss = new SimpleDateFormat("H:mm:ss:SSS a");
		String s4 = sss.format(d);
		System.out.println(s4);
		
		SimpleDateFormat sds = new SimpleDateFormat("HH:ss a");
		String s5 = sds.format(d);
		System.out.println(s5);
		
		SimpleDateFormat dsa = new SimpleDateFormat("yyyy.MMMMM.dd GGG 'at' hh:mm:ss:SSS a,z");
		String s6 = dsa.format(d);
		System.out.println(s6);
		
		
		
		
		
		
		

	}

}
