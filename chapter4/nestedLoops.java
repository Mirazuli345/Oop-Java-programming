package chapter4;

import java.util.Scanner;

public class nestedLoops {
	
	public static void main(String arg[]) {
		
		//Initialization
		int numberofStudents = 24;
		int numberofSubjects = 4;
		
		Scanner input = new Scanner(System.in);
		
		
		for(int i=0;i<numberofStudents;i++) {
			double total =0;
			
			for(int j=0;j<numberofSubjects;j++) {
				
				System.out.print("Enter your score # "+(j+1)+" ");
				double score = input.nextDouble();
				
				total = total + score;
				
			}
			double avg = total/numberofSubjects;
			System.out.println("The test Average for student # "+(i+1) + " is "+avg);
			
			
			
		}
		input.close();
		
	}

}
