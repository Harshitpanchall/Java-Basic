package Exception;

public class Account {
	private double balance;
	
	public double getBalance() {
		return balance;
		
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
		
	}
	
	public void withdraw(double amount) throws Exception {
		if(amount >balance) {
			throw new Exception("hey ");
		
		}else {
			this.balance = balance - amount;
		}
		
	}
	
	

}
