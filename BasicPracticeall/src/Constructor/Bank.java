package Constructor;

public class Bank {
	protected String name;
	protected String address;
	protected double rate;
	

	public Bank(String name, String address, Double rate){
		this.name = name;
		this.address = address;
		this.rate = rate;
		
	}
	
	public String getName() {
		return name;
		
	}
	
	public String getAddress() {
		return address;
		
	}
	
	public double getRate() {
		return rate;
		
	}
}
