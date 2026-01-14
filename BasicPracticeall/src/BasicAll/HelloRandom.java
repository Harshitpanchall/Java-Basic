package BasicAll;

import java.util.Random;
public class HelloRandom {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		for(int i = 0; i < 5; i++) {
			long a = r.nextInt(1000000000);
			System.out.println(a);
			
		}
		
		
	}

}
