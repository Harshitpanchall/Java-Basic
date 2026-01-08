package override;

public class TestShape { 
	public static void main(String[] args) {
		
		Shape s = new Shape();
		System.out.println(s.getName());
		s.area();
		
		Rectangle r = new Rectangle();
		System.out.println(r.getName());
		r.area();
		
		Triangle t = new Triangle();
		System.out.println(t.getName());
		t.area();
	}
	

}
