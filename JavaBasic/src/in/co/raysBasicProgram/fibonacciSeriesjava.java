package in.co.raysBasicProgram;
import java.util.Scanner;
public class fibonacciSeriesjava {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int first = 0, second = 1;
	
		int nextnum;
		
		for(int i = 0; i <= n; i++) {
		nextnum = first + second;
		
		first = second;
		second = nextnum;
		
		System.out.println(first);
	}
	sc.close();

}
}
