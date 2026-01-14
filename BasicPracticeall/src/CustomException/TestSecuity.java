package CustomException;

public class TestSecuity {
	public static void main(String[] args) {
		
		try {
			Security.room(23.3);
		} catch (Exception e) {
			System.out.println("hello is age is beetyr");
			e.printStackTrace();
		}
	}

}
