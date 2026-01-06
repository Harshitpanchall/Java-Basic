package String;

public class AccuranceoofoneString {
	public static void main(String[] args) {
		
		String name = "Harshittt Panchal123";
		String os = "";
		String result = "";
		
		for(int i = 0; i <= name.length(); i++) {
			char ch = name.charAt(i);
			
			if(Character.isDigit(ch)) {
				result = result + ch;
				
				
			}
			if(ch == 't') {
				os = os + ch;
				
			}
			System.out.println(result + os);
		}
		
	}

}
