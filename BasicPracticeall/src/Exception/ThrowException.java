package Exception;

public class ThrowException {
	public void divid(int a, int b) throws Exception   {
		if(b ==0) {
			throw new Exception();
		}else {
			int c = a/b;
			System.out.println(c);
		}
	}
	public static void main(String[] args) {
		ThrowException te = new ThrowException();
		
		try {
		te.divid(23, 34);
		
	}catch(Exception e) {
		System.out.println(e);
	}
	}
}
