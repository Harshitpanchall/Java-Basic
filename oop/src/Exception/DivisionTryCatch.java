package Exception;

public class DivisionTryCatch {
	public static void main(String[] args) {
	
	
	try {
		int division = 10;
		int divisor = 0;
		int result = division / divisor;
		
	}catch(ArithmeticException e) {
		System.out.println(e);
		
	}finally {
		System.out.println("hello try ");
	}

}
}
