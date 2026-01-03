
package in.co.raysBasicProgram;

import javax.sql.rowset.serial.SQLOutputImpl;

public class count {
	public static void main(String[] args) {
		
		String name = "12345";
		
	String result = "";
	
	for(int i = 0; i < name.length(); i++) {
		
		char ch = name.charAt(i);
		
		if(Character.isDigit(ch));
		result = result + ch;
		
	}
	System.out.println("hello" + result);
	System.out.println(name.length());
	}
	

}
