package chapter5;

import java.util.Scanner;

public class CellPhoneBill {
	
	static Scanner input = new Scanner(System.in);
	static double charge = .25;
	
	
	public static void main(String arg[]) { //main method
		
		double planfee=planFee();  //received plan value
		double overCost=overageMinute(); //received minute value
		
		input.close();
		
		System.out.println("Phone Bill Statement");
		plan(planfee); //pass to plan method
		
		double totalmoney= overage(overCost);   //received return value and pass through overage method
		
		double tax1= tax(totalmoney+planfee);    //adding value pass to tax method
		
		totalCost(planfee,totalmoney,tax1);
		
		
		
		
		
	}
	
	public static double planFee() {   //planFee method
		
		System.out.print("Enter base cost of the plan: ");
		double planFee = input.nextDouble();
		return planFee;
		
	}
	
	public static double overageMinute() {  //overage minute
		
		System.out.print("Enter overage minutes: ");
		double minutes = input.nextDouble();
		return minutes;
		
	}
	
	
	public static void plan(double planvalue) {  //plan
		
		System.out.println("Plan: $"+planvalue);
		
	}
	
	public static double overage(double overcost) { //overage
		
		double totalMoney = charge * overcost;
		System.out.println("Overage: $"+totalMoney);
		return totalMoney;
		
	}
	
	public static double tax(double subtotal) { //tax
		
		double vat = .15;
		double payTax = subtotal * vat;
		System.out.println("Tax: $"+payTax);
		return payTax;
		
	}
	
	
	
	
	public static void totalCost(double planfee,double totalMoney,double tax) {  //total
		
		double fullTotal = planfee + totalMoney + tax;
		
		System.out.println("Total: $"+fullTotal);
	}

}
