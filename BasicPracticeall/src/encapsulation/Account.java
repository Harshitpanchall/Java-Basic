package encapsulation;

public class Account { /// encapsulation is not a extend class and in diffent class ar use 
	String name;
	int number;
	double balance;
	
	public String getName() {
		return name;
		
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public int getnumber() {
		return number;
		
	}
	
	public void setNumber(int number) {
		this.number = number;
		
	}
	
	public double getBalance() {
		return balance;
		
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	
	
	}
	
	public void deposit(double amt) {
		balance = balance + amt;
		System.out.println("very this money");
		
	}
	
	public void withdraw(double amt) {
	if(amt >= balance) {
		System.err.println("insufficient balance and tranfeer");
		
	}else {
		System.out.println("invalid number");
	}
	
		
	}
}
