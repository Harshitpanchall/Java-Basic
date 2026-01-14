package ClassObject;

public class TestEmployee {
	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		e.setEmpnum(12);
		e.setEmpbalance(13);
		e.setEmpnumber("Harshit");
		
		System.out.println("empbalance : " + e.getEmpbalance());
		System.out.println("empnum : " + e.getEmpnum());
		System.out.println("number : " + e.getEmpnumber());
		e.displayemp();
		
	}

}
