package Constructor;

public class Test {
	public static void main(String[] args) {
		// Emp e = new Emp("Harshit", "Bhopal", 200000.0);
		AtmCard at = new AtmCard("Uday", 10, 20);
		System.out.println(at.getCvc());
		System.out.println(at.getName());
	}

}
