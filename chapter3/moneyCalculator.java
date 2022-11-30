package chapter3;

import java.util.Scanner;

public class moneyCalculator {
	
	public static void main(String arg[]) {
		
		double penniesValue = .20;
		double nickleValue = .50;
		double quarterValue = .25;
		int dollar = 1;
		
		System.out.print("How many pennies? ");
		Scanner input = new Scanner(System.in);
		
		double pennis = input.nextDouble();
		double penniesResult = pennis * penniesValue;
		
		System.out.print("How many nickles? ");
		double nickles = input.nextDouble();
		double nickleResult = nickles * nickleValue;
		
		System.out.print("How many quqrters? "); //qurter
		double quarters = input.nextDouble();
		double qurterResult = quarters * quarterValue;
		
		double total = penniesResult+nickleResult+qurterResult;
		
		if(total<dollar) {
			double amountShort = dollar - total;
			System.out.print("it's less than one dollar,You need more $"+amountShort);
		}
		else if (total>dollar) {
			double amountMore = total - dollar;
			System.out.print(" it's more than one dollar,You have more $"+amountMore);
		}
		else {
			System.out.print("it's exactly one dollar! you win the game.");
		}
		
		
		
	}

}
