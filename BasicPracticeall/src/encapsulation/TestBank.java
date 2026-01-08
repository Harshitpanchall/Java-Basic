package encapsulation;

public class TestBank {
	
	public static void main(String[] args) {
		
		Bank b = new Bank();
		b.setBalance(23);
		b.setName("Harshit");
	
		
		System.out.println(b.getBalance());
		System.out.println(b.getName());
		
		AxisBank a = new AxisBank();
		a.setRate(23.3);
		System.out.println(a.getRate());
	
	}

}
