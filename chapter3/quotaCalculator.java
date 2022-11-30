package chapter3;

import java.util.Scanner;

public class quotaCalculator {
	
	public static void main(String arg[]) {
		
		int quota = 10;
		System.out.print("Enter sells number of week: ");
		Scanner input= new Scanner(System.in);
		int sells = input.nextInt();
		input.close();
		
		if(sells>=quota) {
			System.out.print("Congratulations you have filled the target");
			
		}
		else {
			int saleShort = quota - sells;
			System.out.print("You have "+saleShort+" sales left to fill out the target");
		}
	}
	

	
    

}
