package in.co.rays.Stringjava;

public class Stringcountdigitjava {

	public static void main(String[] args) {
		
		String name = "harshitttttttt12345654321234543";
		
		String digit = "";
		String s = "";
		
		for(int i = 0; i < name.length(); i++) {
			char sc = name.charAt(i);
			
			if(Character.isDigit(sc)){
			digit = digit + sc;
		}
	
		if(sc == 't') {
			s = s + sc;
		}

	}
	System.out.println(s);
	System.out.println(digit);
	}
}
