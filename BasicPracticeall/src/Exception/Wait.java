package Exception;

public class Wait {
	public static void Wait() throws Exception {
		
		for(int i = 0; i< 10; i++) {
			System.out.println(i);
			throw new Exception("hllm");
		}
		
	}
	public static void main(String[] args) {
	
		try {
			Wait();
			
		}catch(Exception e) {
			System.out.println( "hkeoo "+e.getMessage());
		}
		System.out.println("hello ");
	}

}
