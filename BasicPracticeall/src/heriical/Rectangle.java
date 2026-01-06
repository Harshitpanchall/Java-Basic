package heriical;

public class Rectangle {
	private int length;
	private int base;
	
	public int getLength() {
		return length;
		
	}
	
	public void setLength(int length) {
		this.length = length;
		
	}
	
	public int getBase() {
		return base;
		
	}
	
	public void setBase(int base) {
		this.base = base;
		
	}
	
	public void area() {
	System.out.println("rectangle area :" + length * base);
	
	}
}
