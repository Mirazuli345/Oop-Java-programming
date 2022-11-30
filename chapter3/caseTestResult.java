package chapter3;

import java.util.Scanner;

public class caseTestResult {
	
	public static void main(String arg[]) {
		System.out.print("Enter Your grade: ");
		Scanner input = new Scanner(System.in);
		String grade = input.next();
		input.close();
		
		String message;
		
		switch(grade) {
		
		case "A":
			message="Best Result";
			break;
		case "B":
			message="Good result";
			break;
		case "C":
			message="Need more hard work";
			break;
		default:
			message = "Error INput";
		
		}
		
		System.out.print(message);
	}

}
