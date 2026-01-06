package String;

public class Stringcount {
public static void main(String[] args) {
	
	String name = "Harshit";
	int count = 0;
	
	for(int i = 0; i <= name.length(); i++) {
		char ch = name.charAt(i);
		
		if(Character.isDigit(ch)) {
			count++;
		}
		System.out.print(count);
	}
}
}
