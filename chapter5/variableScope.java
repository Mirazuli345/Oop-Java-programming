package chapter5;

import java.util.Scanner;

public class variableScope {
	static Scanner input = new Scanner(System.in);
	static int requiredSalary = 25000;
	static int requireScore = 7000;
	
	
	public static void main(String arg[]) {
		//initialization
		
		double salary=salary();
		int score=score();
		input.close();
		
		boolean qualified=isUserQualified(salary,score);
		notify(qualified);
		
	}
	
	

	public static double salary() {
		
		System.out.print("Enter your salary: ");
		double salary = input.nextDouble();
		return salary;
	}
	
	public static int score() {
		
		System.out.print("Enter your score: ");
		int score = input.nextInt();
		return score;
	}
	
	
	public static boolean isUserQualified(double salary,int score) {
		if (salary>=requiredSalary && score>=requireScore) {
			return true;
			
		}
		else {
			
			return false;
		}
		
	}
	
	public static void notify(boolean isqulified) {
		// TODO Auto-generated method stub
		if (isqulified) {
			System.out.print("Congrats!You are selectd");
		}
		else {
			System.out.print("Sorry!You need more");
		}

	}

}
