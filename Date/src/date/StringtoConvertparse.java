package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringtoConvertparse {

	public static void main(String[] args) throws ParseException {
		
		String name = "23-04-2025";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		Date d = sdf.parse(name);
		String s = sdf.format(d);
		System.out.println(s);
		System.out.println(d);
		
	}
}
