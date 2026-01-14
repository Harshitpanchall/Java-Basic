package ClassObject;

public class TestBank { 
	public static void main(String[] args) {
		
		Bank b = new Bank();
		
		b.setInterestrate(23.45);
		b.setRate(26.4);
		b.setName("Harshit");
		
		System.out.println(b.getInterestrate());
		System.out.println(b.getRate());
		System.out.println(b.getName());
		
	}

}
