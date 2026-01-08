package override;

public class Testbank {
	
	public static void main(String[] args) {
		
		Bank b = new Bank();
		System.out.println(b.getName() + ":" + b.interestRate());
		
		AxisBank ab = new AxisBank();
		System.out.println(ab.getName() + ":" + ab.interestRate());
		
		HdfcBank hb = new HdfcBank();
		System.out.println(hb.getName() + ":" + hb.interestRate());
		
		
	}

}
