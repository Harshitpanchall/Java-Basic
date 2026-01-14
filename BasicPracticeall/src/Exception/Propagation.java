package Exception;

public class Propagation {
	public static void main(String[] args) {
		try {
			dad();
			
		}catch(Exception e) {
			System.out.println("hello exception e" + e);
		}
	}
	public static void dad() throws Exception {
		mom();
	}
	private static void mom()throws Exception {
		son();
		
	}
	private static void son() throws Exception  {
		throw new Exception("hello");
		
	}

}
