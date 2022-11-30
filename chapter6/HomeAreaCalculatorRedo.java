package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
	
	Scanner input = new Scanner(System.in);
	
	public static void main(String arg[]){
		
		HomeAreaCalculatorRedo calculator= new HomeAreaCalculatorRedo();
		
		Rectangle kitchen = calculator.getRoom();
		Rectangle bathRoom = calculator.getRoom();
		
		
		double area = calculator.calCulateTotalArea(kitchen,bathRoom);
		
		System.out.print("Total Area: "+area);
		
		calculator.input.close();;		
	}
	
	public Rectangle getRoom() {
		
		
		System.out.print("Enter the length of your room: ");
		double length = input.nextDouble();
		
		System.out.print("Enter the length of your width: ");
		double width = input.nextDouble();
		
		//Rectangle room1 = new Rectangle(length,width);
		
		return new Rectangle(length,width);
	
	}
	
	public double calCulateTotalArea(Rectangle rectangle1,Rectangle rectangle2) {
		return rectangle1.calculateArea() + rectangle2.calculateArea();
	}

}
