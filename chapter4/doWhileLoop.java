package chapter4;

import java.util.Scanner;

public class doWhileLoop {
	public static void main(String arg[]) {
		
		Scanner input = new Scanner(System.in);
		boolean again;
		
		do {
			System.out.print("Enter your 1st number: ");
			double firstnumber=input.nextDouble();
			
			System.out.print("Enter your 2nd number: ");
			double secondnumber=input.nextDouble();
			
			double sum = firstnumber + secondnumber;
			System.out.println("Sum is: "+sum);
			
			System.out.println("would you like to start again?");
			again = input.nextBoolean();
			
		} while (again);
		
		input.close();

	}

}
