package Exception;

public class TestArithmetic {
	public static void main(String[] args) {
		
		int k = 16;
		int i = 0;
		
		
		try {
//			int div = k/i;
//		System.out.println(div); ////exception error 
			int a = 10;
			if(a== 10) {
				throw new Exception("Helloooo");
			}
			
		}catch(Exception e) {
			System.out.println("hellonnnn" + e);
			System.out.println(e.getStackTrace());
		}
		finally {
			System.out.println("hello");
		}
	}

}
