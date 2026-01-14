package Exception;

public class TestAccount {
	public static void main(String[] args) {
		
	
	Account a = new Account();
	a.setbalance(100000);
	System.out.println(a.getBalance());
	try {
	a.Withdraw(2000);
	a.Withdraw(2300);
	}catch(Exception e) {
		System.out.println("it is not possible" + e.getMessage());
	}
}
}
	