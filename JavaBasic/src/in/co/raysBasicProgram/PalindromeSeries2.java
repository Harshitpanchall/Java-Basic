package in.co.raysBasicProgram;


public class PalindromeSeries2 {

	public static void main(String[] args) {
		
		int num = 153;
		int rev = 351;
		int original1 = num;
		int original2 = rev;
		
		while(num > rev) {
			int digit = num  % 10;
			rev = rev * 10;
			num = num / 10;
			
		}
		
		if(original1 == num) {
			System.out.println(num);
		
		}
		if(original1 == original2) {
			System.out.println("palindrome");
			
		} else {
			System.out.println("not palindrome");
		}

	}

}
