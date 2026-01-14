package BasicAll;

import java.util.Scanner;
public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int rev = 0;
		int backup = num;
		
		while(num >0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
			
		}
		
		if(backup == rev) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		
	}

}
}
