package ClassObject;

public class TestEmployee {
	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		e.setEmpnum(23);
		e.setEmpbalance(23.34);
		e.setEmpnumber("123454321432");
		
		System.out.println("empbalance : " + e.getEmpbalance());
		System.out.println("empnum : " + e.getEmpnum());
		System.out.println("number : " + e.getEmpnumber());
		e.displayemp();
		
	}

}
