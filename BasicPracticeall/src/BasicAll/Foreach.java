package BasicAll;

public class Foreach {

	public static void main(String[] args) {
		
		int[] text = {23,34,45,667,87,65,434,22,34,45,89};
		int part  = text.length;
		
		for(int t : text) {
			System.out.println(t + part);
			
			
		}
	}
}
