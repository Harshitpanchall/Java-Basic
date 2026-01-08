package SingleInheritance;

public class TestInheritance {
	
	public static void main(String[] args) {
		
		circleInheritance  c = new circleInheritance();
		c.setBorderWidth(10);
		c.setColor("red");
	
		c.setRadius(24);
		
		System.out.println("border :" + c.getWidth());
		System.out.println("color :" + c.getColor());
		System.out.println("radius :" + c.getRadius());
		
	}

}
