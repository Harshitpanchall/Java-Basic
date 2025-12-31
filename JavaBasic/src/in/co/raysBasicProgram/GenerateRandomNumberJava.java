package in.co.raysBasicProgram;

import java.util.Random;

public class GenerateRandomNumberJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		
		for(int i = 0; i < 5; i++) {
			int a = r.nextInt(100);
			System.out.println(a);
			
		}
	
	}


}
