package Interface;

public class TestPerson {
	public static void main(String[] args) {
		
		Businessman b = new Businessman();
		b.airport();
		b.facebook();
		b.instagram();
		b.money();
		b.party();
		
		
		Person p = new Person();
		
		p.setAge(12);
		p.setName("Harshit");
		p.setRoll(23);
		System.out.println(p.getAge());
		System.out.println(p.getName());
		System.out.println(p.getRoll());
	}

}
