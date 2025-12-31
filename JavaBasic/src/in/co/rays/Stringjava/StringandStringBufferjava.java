package in.co.rays.Stringjava;

public class StringandStringBufferjava {
public static void main(String[] args) {
	
	String name = "Hello World";
	
	System.out.println(name);
	System.out.println(name.replace('H','s'));
	System.out.println(name);
	
	String reverse = " ";
	
	String[] str = name.split(" ");
	
	for(int i = 0; i <= name.length(); i++) {
		
		for(int j = str[i].length()-1; j >=0; j--) {
			System.out.print(str[i].charAt(j));
			
		}
		System.out.print(" ");
	}
	
	System.out.println("..........................");
	
	StringBuffer sb = new StringBuffer("hello world");
	
	System.out.println(sb);
	System.out.println(sb.append("harshit"));
	System.out.println(sb);
	System.out.println(sb.reverse());
	
	
	
}
}
