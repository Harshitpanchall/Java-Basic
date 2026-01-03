package SingleInheritance;

public class ShapeInheritance {
	protected String color;
	protected int borderWidth;
	
	public String getColor() {  ///// sinle inheritance parent child shape , circle, test;
		return this.color;
		
	}
	
	public void setColor(String color) {
		this.color = color;
		
	}
	
	public int getWidth() {
		return this.borderWidth;
		
	}
	
	public void setBorderWidth(int borderwidth) {
		this.borderWidth = borderwidth;
		
	}

}
