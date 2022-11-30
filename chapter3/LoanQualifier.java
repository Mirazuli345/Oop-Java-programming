package chapter3;

import java.util.Scanner;

public class LoanQualifier {
	public static void main(String arg[]) {
		
		int requireSalary = 30000;
		int requireYear = 2;
		
		System.out.print("Enter your current Salary: ");
		Scanner input = new Scanner(System.in);
		double salary = input.nextDouble();
		
		System.out.print("Enter your working year: ");
		double workingYear= input.nextDouble();
		input.close();
		
		if(salary>=requireSalary) {
			if(workingYear>=requireYear) {
				System.out.print("Congratulations! You are qualified for the Loan");
			}
			else {
				System.out.print("You must have worked hard at your current job "+requireYear+" years.");
			}
			
		}
		else {
			System.out.print("You must income at least: $"+requireSalary+" to get this Loan");
		}
		
		
		
		
	}

}
