package encapsulation;

public class Account {

	private String number;
	private String accounttype;
	private double balance;

	public String getNumber() {
		return this.number;

	}

	public void setNumber(String number) {
		this.number = number;

	}

	public String getAccounttype() {
		return this.accounttype;

	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;

	}

	public double getBalance() {
		return this.balance;

	}

	public void setBalance(double balance) {
		this.balance = balance;
		
	}
	
	public void deposit(double amt) {
		balance = balance  + amt;
		System.out.println("total deposit balance : " + balance);
	
	}

	public void withdraw(double amt) {
		if(amt > balance) {
			System.err.println("insuficient fund in transfer");
			
		} else {
			System.out.println("valid no.");
		}
		
	}

}
