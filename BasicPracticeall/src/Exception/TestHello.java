package Exception;

public class TestHello {
	
	public static void main(String[] args) {
		
		String name = "Vijay";
		try {
			System.out.println(name.length());
		System.out.println("name" + name.charAt(8));
	
	}catch(Exception e) {
		System.out.println("hello");
	
	}
	}
}
