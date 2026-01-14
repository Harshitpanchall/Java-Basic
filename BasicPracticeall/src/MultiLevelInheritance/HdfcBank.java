package MultiLevelInheritance;

public class HdfcBank extends Bank {
	private String name;
	private double rate;
	
	public String getName() {
		return name;
		
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public double getRate() { //////////////////// or this.name =  this.name se ek same variable banata hai
		return rate;
		//////////////////////////////  this.name =  name ; ///object ka variable hota hai //////////////
	}
	
	public void setRate(double rate) {
		this.rate = rate;
	}

}
