package Constructor;

public class AxisBank extends Bank {
	private double balance;

	public AxisBank(String name, String address, Double rate, double balance) {
		super(name, address, rate);
		this.balance = balance;
		
	}
	
	public double getBalance() {
		return balance;
		
	}

}
