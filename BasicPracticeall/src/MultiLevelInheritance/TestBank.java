package MultiLevelInheritance;

public class TestBank {
	public static void main(String[] args) {
		
		System.out.println("Bank all Details :-");
		AxisBank ab = new AxisBank();
		
		ab.setAge(23);
		ab.setName("bank");
		ab.setBalance(23.34);
		
		System.out.println(".........................................................");
		
		System.out.println("Age : " +ab.getAge());
		System.out.println("name : " + ab.getName());
		System.out.println("balance : " + ab.getBalance());
		
		System.out.println(".............................................................");
		
		HdfcBank hb = new HdfcBank();
		
		hb.setName("Hdfc Bank");
		hb.setRate(23.34);
		
		System.out.println("name : " + hb.getName());
		System.out.println("rate : " + hb.getRate());
		
		System.out.println("..................................................................");
		
		Bank b = new Bank();
		
		b.setName("pnb Bank");
		b.setRate(23.34);
		
		System.out.println("name : " + b.getName());
		System.out.println("rate : " + b.getRate());
		
		
	}

}
