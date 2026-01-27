package Interface;

public class TestCar {
	public static void main(String[] args) {
		
		Car c = new Car();
		c.hrs();
		c.room();
		
		Bike1 b = new Bike1();
		
		b.setName("kawasaki");
		b.setSpeed(2300);
		
		System.out.println(b.getName());
		System.out.println(b.getSpeed());
		
	
		
		
		
	}

}
