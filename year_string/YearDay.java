package year_string;

import java.util.Scanner;

public class YearDay {

	public static void main(String arg[]) {

		System.out.print("Enter a Season of the year: ");
		Scanner input = new Scanner(System.in);

		String season = input.next();

		System.out.print("Enter a Whole number: ");
		int wholeNumber = input.nextInt();

		System.out.print("Enter an adejective: ");
		String adjective = input.next();
		input.close();

		System.out.print("ON a " + adjective + season + " day,I drink a minimum of " + wholeNumber + " Cups of coffee");

	}

}
