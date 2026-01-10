package Exception;

public class PatentCatch {
	public static void main(String[] args) {
		
		String name = "Sunil Sahu Sir";
		
		try {
			System.out.println("Name Sir : " + name.length());
			System.out.println("Character name : " + name.charAt(8) + "charcter not invalid no.");
			
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
			
		}finally {
			System.out.println("hello sir ");
		}
	}

}
