package chapter7;
import java.util.Arrays;
import java.util.Random;

public class ArrayLotteryTicket {
	
	private static final int LENGTH=6;
	private static final int MAXNUMBER=69;
	
	public static void main(String[] args) {
		
		int[] ticket=generateNumbers();
		
		Arrays.sort(ticket);
		
		printTicket(ticket);
		
	}
	
	public static int[] generateNumbers() {
		
		int[] ticket = new int[LENGTH];
		Random random = new Random();
		
		for(int i=0;i<LENGTH;i++) {
			
			int randomNumber;
			
			do {
				
				randomNumber = random.nextInt(MAXNUMBER)+1;
			}
			while(search(ticket,randomNumber));
			
			
			ticket[i]= randomNumber;
			
		}
		return ticket;
	}
	
	
	
	public static boolean search(int[] array,int numberToSearchFor) {
		
		//enhanceLoop
		for(int value : array) {
			if(value == numberToSearchFor) {
				return true;
			}
		}
		
		return false;
		
	}
	
	//binary Search
	
	public static boolean binarySearch(int[] array,int numberTosearchfor) {
		
		// array must be sorted
		
		Arrays.sort(array);
		int index=Arrays.binarySearch(array,numberTosearchfor);
		
		if(index>=0) {
			return true;
		}
		else return false;
		
	}
	
	
	
	public static void printTicket(int ticket[]) {
		
		for(int i=0;i<LENGTH;i++) {
			System.out.print(ticket[i]+" | ");
		}
		
	}

}
