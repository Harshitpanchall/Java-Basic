package Interface;

public class TestAxisBank {
	public static void main(String[] args) {
		
	AxisBank ab = new AxisBank();
	ab.interestrate();
	ab.balance();
	ab.loan();
	ab.name();
	
	Bank b = new Bank();
	
     b.setName("Harshit Panchal");
     b.setRate(23.23);
     
     System.out.println("name : " + b.getName());
     System.out.println("rate : " + b.getRate());
	
	}

}
