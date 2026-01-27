package CustomException;

public class TestAuthencaction {
	public static void main(String[] args) {
		
		Account c = new Account();
		
		c.setBalance(600);
		
		System.out.println(c.getBalance());
		
		try {
			c.withdraw(100);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
