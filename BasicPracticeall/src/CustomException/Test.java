package CustomException;

public class Test {
	public static void main(String[] args) {
		
		UserServisess us =new  UserServisess();
		try {
		UserServisess.delete("harshiut");
		}catch(Exception e) {
			System.out.println("Hello" + e);
		}
	}

}
