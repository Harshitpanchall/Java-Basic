package CustomException;

public class Secure {
	
public static void main(String[] args) {
	
		try {
			throw new Exception("accessdenied");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}finally {
			System.out.println("hello");
		}
}
		
	}


