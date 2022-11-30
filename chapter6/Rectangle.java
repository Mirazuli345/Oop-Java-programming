package chapter6;

public class Rectangle {
	
	private double length;
	private double width;
	
	
	public Rectangle() { //default constructor
		
		length=0;
		width=0;
	}
	
	public Rectangle(double length,double width){
		setLength(length);
		setwidth(width);
	}
	
	
	/* public double getLentgth() {
		return length; 
	}*/
	
	public void setLength(double length) {
		
		this.length = length;
	}
	
	/* public double getWidth() {
		return width;
	}*/
	
	public void setwidth(double width) {
		this.width=width;
	}
	
	
	
	
	double calculatePerimeter() {
		
		return (2*length) + (2*width);
		
	}

	double calculateArea() {
		return length * width;
		
	}
	
}



