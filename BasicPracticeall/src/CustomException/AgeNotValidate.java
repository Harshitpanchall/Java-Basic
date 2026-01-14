package CustomException;

public class AgeNotValidate {
	public static void Agevalidate(int age) throws Exception {
	if(age < 18) {
	throw new Exception("Yes age is validate");
	}
	System.out.println("age is vote ");
	

}
}
