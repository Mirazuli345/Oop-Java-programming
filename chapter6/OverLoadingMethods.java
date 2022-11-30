package chapter6;

public class OverLoadingMethods {
	
	public static int getMonth(String month) {
		
		switch (month) {
		case "January": return 1;
		case "February": return 2;
		case "March": return 3;
		case "April": return 4;
			

		default: return -1;
			
		}
	}
	
	public static String getMonth(int month) {
		
		switch (month) {
		case 1: return "January";
		case 2: return "February";
		case 3: return "March";
		case 4: return "April";
			
		default: return "Invalid month";
		
		}
		
	}

}
