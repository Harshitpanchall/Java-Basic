package Exception;

public class ExceptionMultiple {
	public static void main(String[] args) {
		
		String name = "harshit";
		
		try {
			int x = 10;
			int  y = 0; /////exception aati ha tho catch handle kar le ta ha
			
			int c = y / x;
			System.out.println("Name length : " + name.length());
			System.out.println("Name Character : "+ name.charAt(4)+ " " + name.toUpperCase());
			
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			
		}catch(NullPointerException e) {
			System.out.println(" yes is nullpointer " + e.getMessage());
			
		}finally {
			System.out.println("hello nullPointer is yes");
		}
	}

}
