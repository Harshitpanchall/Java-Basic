package StaticKeword;

public class TestCompany {
public static void main(String[] args) {
	
	CompanyName cn = new CompanyName();
	
	cn.name();
	System.out.println(cn.getName());

	CompanyName.hr();
	CompanyName.name();
	
	CEO c = new CEO();
	
	CEO.project();
}
}
