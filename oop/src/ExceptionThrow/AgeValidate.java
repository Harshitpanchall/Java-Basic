package ExceptionThrow;

public class AgeValidate {
	public static void main(String[] args) {
		
		int age = 9;
		try {
			if(age <= 18) {
			System.out.println("tum kooch nahi hi");
			throw new Exception("hekko");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("hello world");
		
	}
}
}



