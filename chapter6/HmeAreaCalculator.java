package chapter6;

public class HmeAreaCalculator {
	
	public static void main(String arg[]) {
		
		//rectangle1
		//create instance of Rectangle class
		
		Rectangle room1 = new Rectangle();
		
		room1.setwidth(25);
		room1.setLength(50);
		
		double areaOfRoom1 = room1.calculateArea();
		
		
		//rctangle2
		
		Rectangle room2 = new Rectangle(30, 35);
		
		double areaOfRoom2 = room2.calculatePerimeter();
		
		
		double totalArea = areaOfRoom1+areaOfRoom2;
		
		System.out.print("Total Area is: "+totalArea);
		
	}

}
