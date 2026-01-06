package String;

public class StringAndStringBuffer {
public static void main(String[] args) {
	
	String name = "harshit Panchal";
	System.out.println(name);
	System.out.println(name.replace('a','s'));
	System.out.println(name);
	
	String reverse = "";
	
	String[] str = name.split(" ");
	
	for(int i = 0; i <= name.length(); i++) {
		for(int j = str[i].length()-1; j >=0; j--) {
			System.out.print(str[i].charAt(j));
			
			
		}
		
		System.out.print("");
	}
	
}
}
