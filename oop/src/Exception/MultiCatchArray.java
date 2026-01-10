package Exception;

public class MultiCatchArray {
	public static void main(String[] args) {
		
		try {
			int a = 10;
			int b = 0;
			int c = a / b;
			
			int[] arr = new int[3];
			arr[5] = 10000;
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("hello try catch");
		}
	}

}
