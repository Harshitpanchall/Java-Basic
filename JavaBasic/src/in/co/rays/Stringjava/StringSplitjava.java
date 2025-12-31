package in.co.rays.Stringjava;

public class StringSplitjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "hello World sir";
		
		String rev = "";
		
		String[] str = name.split(" ");
		
		for(int i = 0; i <=name.length(); i++) {
			
			for(int j = str[i].length()-1; j >=0 ; j--) {
				System.out.print(str[i].charAt(j));
				
			}
			System.out.print(" ");
		}
		
	}

}
