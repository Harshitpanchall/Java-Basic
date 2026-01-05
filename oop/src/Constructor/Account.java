package Constructor;

public class Account {
	
	private String number;
	private String accounttype;
	private double balance;   // parameter 
	
	public Account(String number, String accounttype, double balance) { // it is constructor create a account object it's a required the method and attributes// 
		this.number = number;
		this.accounttype = accounttype;
		this.balance = balance;
		
	}
	
	public String getNumber() {
		return number;
		
	}
	
	public String getAccounttype() {
		return accounttype;
		
	}
	
	public double getBalance() {
		return balance;
		
	}

}
