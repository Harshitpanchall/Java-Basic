package CustomException;

public class Bank {
	public static void lowbalance(int balance) {
		
		if(balance < 100000) {
			throw new LowBalanceException("yes it balance");
			
		}
		System.out.println("withdraw balance  : 2000000");
	}

}
