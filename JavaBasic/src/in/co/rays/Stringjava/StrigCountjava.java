package in.co.rays.Stringjava;

public class StrigCountjava {

	public static void main(String[] args) {
		
		String name = "hello";
		int count = 0;
		
		for(int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			
		
		if(Character.isDigit(ch)) {
			count++;
			
		}
		
		
	}
	System.out.println(count);

}
}
