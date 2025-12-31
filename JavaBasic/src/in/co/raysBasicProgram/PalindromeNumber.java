package in.co.raysBasicProgram;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int rev = 0;
		int backup = n;
		
		while(n >0) {
			int digit = n % 10;
			rev = rev *10 + digit; // rev banata hai
			n = n / 10;
		
				
			}
		if(backup == rev) {
			System.out.println("palindrome");
			
		} else {
			System.out.println("not Palindrome");
		}
		

	}

}
