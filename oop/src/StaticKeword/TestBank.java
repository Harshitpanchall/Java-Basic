package StaticKeword;

public class TestBank {
	public static void main(String[] args) {
		
		Bank b = new Bank();
		
		System.out.println( "Rate : " + b.getRate());
		System.out.println("Sum  : " + b.getSum());
		b.name();
		
		HdfcBank hb = new HdfcBank();
		
		System.out.println( "Name : " + hb.getName());
		hb.interestrate();
		
		
	}

}
