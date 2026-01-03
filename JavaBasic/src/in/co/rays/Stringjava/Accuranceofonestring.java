package in.co.rays.Stringjava;

public class Accuranceofonestring {

	public static void main(String[] args) {
		
		String name = "Hellooooooooo Harshit1234";
		
		String os = "";
		String result ="";
		String rev = "";
		
		for(int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			
			if(Character.isDigit(ch)) {
				result = result + ch;
				
			}
			
			if(ch == 'o') {
				os = os + ch;
				
			}
			
		}
	
		/// reverse split///
			String[] str = name.split(" ");
			
			for(int k = 0; k <= name.length(); k++) {
				
				for(int l = str[k].length()-1; l >= 0; l--) {
					System.out.print(str[k].charAt(l));
				
				}
				System.out.print(" ");
		
			}
			System.out.println(os);
			System.out.println(result);
	}
}


