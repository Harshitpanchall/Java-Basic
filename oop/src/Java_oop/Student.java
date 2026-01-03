package Java_oop;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
	
		private String name;
		private int age;
		private Date dob;
			
		
		
		public String getName() {
			return this.name;
			
		}
		
		public void setName(String name) {
			this.name = name;
			
		}
		
		public int getAge() {
			return this.age;
			
		}
		
		public void setAge(int age) {
			this.age = age;
			
		}
		
		public Date getDob() {
			return this.dob;
			
		}
		
		public void setDob(Date dob) {
			this.dob =dob;
			
			
		}
		
		public void checkAge(int age) {
			if(age> 17) {
				System.out.println("age is high" + age);
			
			} else {
				System.out.println("age is low");
				
			}
		}
		public static void main(String[] args) throws ParseException {
			
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
			
			Date d = new Date();
			Student s = new Student();
			Date a = sdf.parse("23.04.2003");
			System.out.println(a);
			
			s.setName("harshit");
			s.setAge(15);
			s.setDob(a);
			
			System.out.println("name " +s.getName());
			System.out.println("age" + s.getAge());
			System.out.println("dob" + s.getDob());
			
			
			
		
		}

		
			
		}

		


