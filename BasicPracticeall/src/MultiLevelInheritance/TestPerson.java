package MultiLevelInheritance;

public class TestPerson {
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setRoll(23);
		System.out.println("ROLL : " + s.getRoll());
		
		Doctor d = new Doctor();
		d.setName("Harsh");
		System.out.println("name :" + d.getName());
		
		Person p = new Person();
		p.setAddress("bhopal");
		p.setAge(24);
		p.setName("Harshit");
		
		System.out.println("address : "+ p.getAddress());
		System.out.println("name : "+ p.getName());
		System.out.println("age : "+ p.getAge());
		p.age();
		
		
	}

}
