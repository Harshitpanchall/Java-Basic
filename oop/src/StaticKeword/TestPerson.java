package StaticKeword;

public class TestPerson {
	public static void main(String[] args) {
	
		Person p = new Person();
		
		p.roll= 23;
		Person.name = "Harshit";
		
		System.out.println(p.getName());
		System.out.println(p.getRoll());
		
		Student s = new Student();
		
		s.enroll = 1;
		Student.photo = 2;
		
		System.out.println(s.getEnroll());
		System.out.println(s.getPhoto());
	}
}
