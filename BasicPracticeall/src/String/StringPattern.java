package String;

public class StringPattern {
public static void main(String[] args) {
	
	String name = "vijay Dinanth chouhans";
	
	System.out.println(name.length());
	System.out.println("lowerCase : " + name.toLowerCase());
	System.out.println("uppercase : " + name.toUpperCase());
	System.out.println("start : " + name.startsWith("vijay"));
	System.out.println("end : "+ name.endsWith("hans"));
	System.out.println("substring : " + name.substring(6));
}
}
