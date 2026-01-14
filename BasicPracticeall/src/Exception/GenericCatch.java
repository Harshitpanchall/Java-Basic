package Exception;

public class GenericCatch {
	public static void main(String[] args) {
		
		String name = "Harshit";
		
		try {
			System.out.println(name.length());
			System.out.println(name.charAt(9));
			
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("hello");
				
		}catch(RuntimeException e) {
			System.out.println("helo hye");
		}
	}

}
