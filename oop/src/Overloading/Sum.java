package Overloading;

public class Sum {
	public int sum(int i, int j) {
		return i+j;
		
	}
	
	public int sum(int i, int j, int k) {
		return i+j+k;
		
	}
	
	public double sum(double i, double j) {
		return i+ j;
		
	}
	
	public static void main(String[] args) {
		
		Sum s = new Sum();
	System.out.println(s.sum(34, 32));
	System.out.println(s.sum(23, 56, 36));
	System.out.println(s.sum(23, 56));
		
	}

}
