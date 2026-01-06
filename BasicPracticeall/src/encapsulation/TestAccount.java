package encapsulation;

public class TestAccount {
	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.setBalance(2000);
		a.setName("Harshit");
		a.setNumber(23);
		
		System.out.println("balance : " + a.getBalance());
		System.out.println("name : " + a.getName());
		System.out.println("number :"+ a.getnumber());
		a.deposit(20000000);
		a.deposit(200);
		a.withdraw(50000);
		a.withdraw(2000000);
		
	}

}
