package Polymorphism;

public class TestShapeArray {
	
	public static void main(String[] args) {
		
		Shape[] s = new Shape[2];
		System.out.println("shape length : " + s.length);
		
		s[0] = new Circle();
		s[1] = new Rectangle();
		
		Circle c = (Circle) s[0];
		c.setRadius(23);
		System.out.println(c.getColor());
		System.out.println(c.getWithborder());
		
		Rectangle r = (Rectangle) s[1];
		r.setLength(23);
		r.setBase(24);
		
		System.out.println(r.getLength());
		System.out.println(r.getBase());
		
		for(int i = 0; i <= s.length; i++) {
			System.out.println(i);
		}
		
		
	}

}
