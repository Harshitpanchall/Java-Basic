package MultiLevelInheritance;

public class Person {
	protected String name;
	protected String address;
	protected int age;
	
	public String getName() {
		return name;
		
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public String getAddress() {
		return address;
		
	}
	
	public void setAddress(String address) {
		this.address = address;
		
	}
	public int getAge() {
		return age;
		
	}
	
	public void setAge(int age) {
		this.age = age;
		
	}
	
	public void age() {
		if(age <= 30) {
			System.out.println("age is a high");
			
		}else {
			System.out.println("invalid age");
		}
	}
	
	

}
