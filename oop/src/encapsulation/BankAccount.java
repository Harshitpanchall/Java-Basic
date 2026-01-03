package encapsulation;

import java.security.DomainCombiner;

public class BankAccount {
	
	private String number;
	private double balance;
	
	public String getNumber() {
		return this.number;
		
		
	}
	
	public void setNumber(String number) {
		this.number = number;
		
		
	}
	
	public double getBalance() {
		return this.balance;
		
		
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
		
	}
	
	public void deposit(double amt) {
		balance = balance + amt;
		System.out.println(balance);
		
	}
	
		public void withdraw(double amt) {
			if(amt > balance) {
				System.out.println("in sufficient balance");
			}else {
				System.out.println("invalid n. ");
				
			}
			
		}
		
		public static void main(String[] args) {
			
			BankAccount ba = new BankAccount();
			
			String number  = "987656789876";
			ba.setBalance(500.00);
			ba.setNumber(number);
			
			System.out.println("number : " + ba.getNumber());
			System.out.println("balance : " + ba.getBalance());
			ba.deposit(10000);
			ba.deposit(2000000);
			ba.withdraw(20000);
			ba.withdraw(234);
		}
	}
	
	

