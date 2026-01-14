package CustomException;

public class Security {
	public static void room(double age) throws Exception {
		if(age > 18) {
			throw new Exception("hello");
			
			
		}
		System.out.println("hello is age clear");
		
	}

}
