package Abstract;

public class TestBank {
	
	public static void main(String[] args) {
		
		Bank b = new AxisBank();
		b.interestrate();
		Bank.Rate = 23;
		
		AxisBank a = new AxisBank();
		a.rateinterest();
	}

}
