package Constructor;

public class TestBank {
	
	public static void main(String[] args) {
		
		AxisBank ab = new AxisBank("Harshit","Bhopal",3.45,400000);
		System.out.println("name : " + ab.getName());
		System.out.println("address : " + ab.getAddress());
		System.out.println("balance : " + ab.getRate());
		
	}

}
