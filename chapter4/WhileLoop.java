package chapter4;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String arg[]) {
		
		int rate = 15;
		int max = 40;
		
		
		System.out.print("Enter the number of working hour in week: ");
		Scanner input = new Scanner(System.in);
		double workingHour = input.nextDouble();
		
		
		while (workingHour > max || workingHour < 1) {
			System.out.print("Invalid working hour!Try again");
			 workingHour = input.nextInt();
		}
		input.close();
		
		double Pay = workingHour * rate;
		
		System.out.print("Total money is: $"+Pay);
	}

}
