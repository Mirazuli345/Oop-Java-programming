package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
	public static void main(String arg[]) {
		
		System.out.print("Enter the number of hours the employee worked:");
		Scanner input = new Scanner(System.in);
		int hours=input.nextInt();
		
		System.out.print("Enter the employe's pay rate: ");
		double rate= input.nextDouble();
		input.close();
		
		double grosspay= hours * rate;
		
		System.out.print("Total mone is: $" +grosspay);
	}

}
