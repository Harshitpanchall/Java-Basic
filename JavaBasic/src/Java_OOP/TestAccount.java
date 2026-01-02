package Java_OOP;

public class TestAccount {

	public static void main(String[] args) {

		Account a = new Account();

		a.setNumber("9890022347");
		a.setAccounttype("current balance");
		a.setBalance(500.00);

		System.out.println("number : " + a.getNumber());
		System.out.println("accounttype : " + a.getAccounttype());
		System.out.println("balance : " + a.getBalance());
		a.deposit(1000.00);
	
}
}
