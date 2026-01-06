package String;

public class Stringsplit {
	public static void main(String[] args) {
		
		String name = "harshit Panchal";
		String reverse = "";
		
		String[] str = name.split(" ");
		for(int i = 0; i <= name.length(); i++) {
			
			for(int j = str[i].length()-1; j >= 0; j--) {
				
				System.out.print(str[i].charAt(j));
				
			}
		}
		System.out.print(" ");
		
	}

}
