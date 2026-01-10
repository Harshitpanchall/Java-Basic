package Interface;

public class AxisBank extends Bank implements Hdfc, Punjab {

	@Override
	public void interestrate() {
		System.out.println("interestrate : "+"23.34");
		
	}

	@Override
	public void balance() {
		System.out.println( "Balance : "+"5000000000");
		
	}

	@Override
	public void loan() {
		System.out.println("Loan : "+"3.3% loan ");
		
	}

	@Override
	public void name() {
		System.out.println("Name : " + "Head of branch of banks ");
		
	}
	

}
