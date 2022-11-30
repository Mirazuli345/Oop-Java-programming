package chapter11;

public class ShapeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction rectangle = new Rectangle(30, 40);
		
		rectangle.print();
		System.out.println(rectangle.calculateArea());

	}

}
