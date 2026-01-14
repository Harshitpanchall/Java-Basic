package Exception;

public class Account {
	double balance;
	
	public double getBalance() {
		return balance;
		
	}
	public void setbalance(double balance) {
		this.balance = balance;
		
	}
	public void Withdraw(double amount) throws Exception {
		if(amount <= this.balance) {
			System.out.println("invalid Insufficient funds :  ");
			throw new Exception("helo");
		}
			if(amount > this.balance) {
				
		}else {
			this.balance = this.balance - amount;
			System.out.println("insufficinet is high funs");
		}
		
	
	}


}
