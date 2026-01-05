package Constructor;

public class TestShape {
	public static void main(String[] args) {
		
     Shape s = new Shape("Circle", 45);
     
     System.out.println("name : " + s.getName());
     System.out.println("widthborder : " + s.getWidthorder());
	}

}
