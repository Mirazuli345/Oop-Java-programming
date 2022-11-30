package chapter4;

import java.util.Scanner;

public class ForLoop {
	
	public static void main(String arg[]) {
		
		System.out.print("Enter the number of items: ");
		Scanner input = new Scanner(System.in);
		int item = input.nextInt();
		
		double total =0;
		
		for(int i=0;i<item;i++) {
			System.out.print("Enter your products price: ");
			double price= input.nextDouble();
			
			total = total + price; 
			
		}
		input.close();
		
		System.out.print("YOUR total price is: "+total);
		
	}

}
