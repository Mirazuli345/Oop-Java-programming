package chapter7;

import java.util.Scanner;

public class DayOftheWeek {
	 
	
	
	
     public static void main(String[] args) {
    	 
    	 String[] days= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    	 
    	 Scanner input = new Scanner(System.in);
    	 System.out.println("Enter your day number of the week: ");
    	 
    	 int index=input.nextInt();
    	 input.close();
    	 
    	 System.out.println("Corresponding day: "+days[index-1]);
    	 
    	 
     }
     
     
	

}
