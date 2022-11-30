package OopPhoneBillCalculate;


public class PhoneBill {
	
	int id;
	double baseCost;
	double allotedMinutes;
	double minuteUsed;
	
	
	public PhoneBill() {
		
		id=0;
		baseCost=79.99;
		allotedMinutes=800;
		minuteUsed=800;
		
	}
	
	public PhoneBill(int id) {
		this.id=id;
		baseCost=79.99;
		allotedMinutes=800;
		minuteUsed=800;
	}
	
	public PhoneBill(int id,double baseCost, double allotedMinutes,double minuteUsed) {
		this.id= id;
		this.baseCost=baseCost;
		this.allotedMinutes=allotedMinutes;
		this.minuteUsed=minuteUsed;
		
	}
	
	
	public int getId() {
		return id;
		
	}
	
	public void setId(int id) {
		this.id=id;
		
	}
	
	public double getbaseCost() {
		return baseCost;
		
	}
	
	public void setBasecost(double baseCost) {
		
		this.baseCost=baseCost;
		
	}
	
	
	public double getAllotedMinutes() {
		return allotedMinutes;
		
		
	}
	
	public void setAllotedMinutes(double minutes) {
		allotedMinutes = minutes;
	}
	
	public double setMinuteused() {
		return minuteUsed;
		
	}
	
	public void getMinuteused(double minutes) {
		
		minuteUsed=minutes;
	}
	
	public double calculateOverage() {
		
		double overageRate = .25;
		
		double overgeMinute = allotedMinutes-minuteUsed;
		
		return overageRate*overgeMinute;
		
	}
	
	public double calculateTax() {
		
		double taxRate=.15;
		return taxRate*(baseCost+calculateOverage());
		
	}
	
	public double calculateTotal() {
		return baseCost+calculateOverage()+calculateTax();
		
	}
	
	public void printItemizedBill() {
		System.out.println("ID: "+id);
		System.out.println("Base Rate: "+baseCost);
		System.out.println("Overage Fee: $"+ calculateOverage());
		System.out.println("Tax: $"+calculateTax());
		System.out.println("Total: $"+calculateTotal());
	}
	

}


