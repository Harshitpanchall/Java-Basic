package Java_oop;

public class TestAccount {

	public static void main(String[] args) {

		Account a = new Account();

		a.setNumber("9890022347");
		a.setAccounttype("current balance");
		a.setBalance(500.00);

		System.out.println("number : " + a.getNumber());
		System.out.println("accounttype : " + a.getAccounttype());
		System.out.println("balance : " + a.getBalance());
		a.deposit(10000.00);
		a.withdraw(2000);
		a.withdraw(100000.00);
		
		
	
}
}
