package Exception;

import java.util.Scanner;
public class ExceptioDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dividend = sc.nextInt();
		int divisor = sc.nextInt();
		try {
		int result = dividend/divisor;
		System.out.println("your is divided"+result);
		
		}catch(Exception e) { /// e is object 
			System.out.println(e.getMessage());
			
		}
	}
}
