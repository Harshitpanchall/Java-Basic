package Exception;

public class MainClass {
	public static void main(String[] args) {
		
		int[] a = new int[4];
		
		try {
			int b = 5/0;
			System.exit(b);
		System.out.println(a[9]);
		}catch(ArithmeticException e) {
			System.out.println("hello" + e.getMessage());
		}finally {
			System.out.println("hello");
		}
	}
	
}
