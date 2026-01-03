package in.co.raysBasicProgram;

public class SwapTwoNumber {

	public static void main(String[] args) {
		int  a = 10;
		int b = 23;
		int c = 20;
		int d = 30;
		
		System.out.println("a : " + a);
		System.out.println("b :" + b);
		System.out.println("c : " + c);
		
		//// swap two number //
		
	a = a -b;
	a = b -a;
	b = a + c;
	c = c - a;
	d = a + c;
	
	System.out.println("a :" + a);
	System.out.println("a :" + a);
	System.out.println(" b : "+ b);
	System.out.println("c : " + c);
	System.out.println("d : " + d);
		
	}
}
