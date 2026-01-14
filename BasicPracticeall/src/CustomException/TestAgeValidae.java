package CustomException;

public class TestAgeValidae {
	public static void main(String[] args) {
		
		try {
			AgeNotValidate.Agevalidate(15);
		}catch(Exception e) {
			System.out.println("what is agevalidate : " + e);
			
		}
	

		
	}

}
