package Constructor;

public class TestAccount {
	
	public static void main(String[] args) {
		
		Account a = new Account("12345432123432", "Sbi India indore", 500000.00);
		
		System.out.println("Account : " + a.getAccounttype());
		System.out.println("number : " + a.getNumber());
		System.out.println("balance : " + a.getBalance());
	}

}
