package Java_oop;

public class TestAutomobile {
	public static void main(String[] args) {

		Automobile a = new Automobile();

		a.setColor("red");
		a.setGear(9);
		a.setMake("kia");

		System.out.println("Color : " + a.getColor());
		System.out.println("grear : " + a.getGear());
		System.out.println("Make : " + a.getMake());

	}

}
