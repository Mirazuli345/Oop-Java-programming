package chapter3;

import java.util.Scanner;

public class salaryCalculator {
	
	public static void main(String arg[]) {
		
		int salary = 10000;
		int bonus = 2500;
		
		System.out.println("How manny sells have don in this week? ");
		Scanner input = new Scanner(System.in);
		int sell = input.nextInt();
		input.close();
		
		if(sell>10) {
			salary = salary+bonus;
		}
		
		System.out.print("Total salary is: $"+salary);
		
	}

}
