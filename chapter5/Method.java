package chapter5;

import java.util.Scanner;

public class Method {
	
	public static void main(String arg[]) {
		
		System.out.print("Enter your Name: ");
		Scanner input = new Scanner(System.in);
		String name = input.next();
		input.close();
		method(name);
		
		
	}
	
	public static void method(String name) {
		System.out.print("Hi there, "+name);
	}

}
