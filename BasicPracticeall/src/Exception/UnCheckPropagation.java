package Exception;

public class UnCheckPropagation {
	public static void main(String[] args) {
		dad();
		
	}
	public static void dad() {
		mom();
		

	}
	private static void mom() {
		son();
		
		
	}
	private static void son() {
		throw new RuntimeException("hello");
		
	}
	

}
