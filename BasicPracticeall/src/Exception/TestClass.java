package Exception;

public class TestClass {
	public static void main(String[] args) {
	
		String name = null;
		
		try {
			System.out.println("name : "+ name.length()) ;
			System.out.println("name : " + name.charAt(10));
			int a= 10/0;
			int[] arr = new int[5];
			
		}catch(ArithmeticException e) {
			System.out.println("hello me choota hu");
			
		}catch(NullPointerException e) {
			System.out.println("hello padha hu");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Hello Hello");
		}finally {
			System.out.println("hello");
		}
	}

}
