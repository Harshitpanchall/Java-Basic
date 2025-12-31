package ControlStatement;

public class ifElseJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks = 80;
		
		if(marks >= 90) {
			System.out.println("marks A :");
			
		} else if(marks >= 85) {
			System.out.println("marks B :");
			
		}else if(marks >= 75) {
			System.out.println("marks : C" );
			
		} else if(marks >= 45){
			System.out.println("marks D");
			
		}else if(marks >= 20) {
			System.out.println("marks low :");
			
		}else {
			System.out.println("Invalid");
		}

	}

}
