package in.co.rays.controlstatement;

public class SwitchCaseJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int days = 5;
		
		switch(days) {
		
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("wednesday");
			break;
			
		case 4:
			System.out.println("thusday");
			break;
		case 5:
			System.out.println("friday");
			
		case 6:
			System.out.println("saturaday");
			
		case 7:
			System.out.println("sunday");
			
			default : 
				System.out.println("invalid no.");
				break;
			
		}

	}

}
