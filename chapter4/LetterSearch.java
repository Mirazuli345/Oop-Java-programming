package chapter4;

import java.util.Scanner;

public class LetterSearch {
	
	public static void main (String arg[]) {
		
	 //get text
		System.out.print("Enter some text: ");
		Scanner input = new Scanner(System.in);
		String text = input.next();
		
		input.close();
		
		boolean LetterFound = false;
		
		for(int i=0; i<text.length();i++) {
			
			char currentLetter = text.charAt(i);
			
			if (currentLetter=='a' || currentLetter=='A') {
				
				LetterFound = true;
				break;
				
			}
			
		}
		if (LetterFound) {
			
			System.out.print("This text contains the the Letter A");
			
		}else {
			System.out.print("This text doesn't contains Letter A");
		}
		
	}

}
