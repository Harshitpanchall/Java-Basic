package Exception;

public class DivisionTryCatch {
	public static void main(String[] args) {
	
	try {
		int a = 10;
		int b = 0;
		System.out.println(10/0);
	}catch(ArithmeticException e) {
		System.out.println(e.getMessage());
		
	}finally {
		System.out.println("hello");
	}

}
}
