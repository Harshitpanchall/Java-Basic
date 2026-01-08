package Overloading;

public class Vehicle {
	public void speed() {
		System.out.println( "name speed :" +  "200km/hr");
		
	}
	
	public void hour() {
		System.out.println("hours Time : " + "2:00 pm ");
		
	}
	
	public int radio(int i,int j) {
		return i+j;
		
	}
	
	public static void main(String[] args) {
	
		Vehicle v = new Vehicle();
		
		v.speed();
		v.hour();
		System.out.println( "sum : "+ v.radio(23, 34));
		
	}
}
