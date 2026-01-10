package MultipleInterface;

public class Student implements Employee,manager {

	@Override
	public void study() {
		System.out.println("room");
		
	}

	@Override
	public void balance() {
		System.out.println("3000000");
		
	}

	@Override
	public void checkout() {
		System.out.println("hello ");
		
	}

}
