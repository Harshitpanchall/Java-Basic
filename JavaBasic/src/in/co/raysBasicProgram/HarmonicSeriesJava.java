package in.co.raysBasicProgram;
import java.util.Scanner;

public class HarmonicSeriesJava {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		double d = 0.0;
		double sum = 0;
		
		for(int i = 1; i <= num; i++) {
			System.out.println("1/" + i);
			
			if(i != num) {
				System.out.println("+");
				
			}
			sum = sum + (1.0 / i);
			
		}
		System.out.println(sum);

	}

}
