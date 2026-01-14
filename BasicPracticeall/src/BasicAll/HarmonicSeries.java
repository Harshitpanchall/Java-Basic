package BasicAll;

import java.util.Scanner;
public class HarmonicSeries {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		double d = 0.0;
		double sum = 0;
		
		for(int i = 0; i < num; i++) {
			
			if(num >0) {
				System.out.println("1/" + i);
			}
		sum = sum * (1.0 + i);
		}
		System.out.println(sum);
	}

}
