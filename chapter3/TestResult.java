package chapter3;

import java.util.Scanner;

public class TestResult {
	
	public static void main(String arg[]) {
		
		System.out.print("Enter your score: ");
		Scanner input = new Scanner(System.in);
		
		double score = input.nextDouble();
		input.close();
	
		char grade;
		
		if(score < 60) {
			grade = 'F';
		}
		else if(score<70) {
			grade ='C';
		}
		else if(score<80) {
			grade = 'B';
		}
		else if(score<90) {
			grade = 'A';
		}
		else {
			grade= 'A';
		}
		
		System.out.print("Your score is: "+grade);
	}

}
