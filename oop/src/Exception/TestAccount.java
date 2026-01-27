package Exception;

public class TestAccount {
	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.setBalance(20000.00);
		
		System.out.println(a.getBalance());
		
		try {
			a.withdraw(200);
		} catch (Exception e) {
			
		}
	}

}
