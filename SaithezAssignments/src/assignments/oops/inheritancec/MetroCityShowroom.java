package assignments.oops.inheritancec;

public class MetroCityShowroom extends UrbanShowroom {
/* Multilevel inheritance
 * MetroCityShowroom inherits Urban
 * UrbanShowroom inherits Village
 */
	
	public static boolean carLoan() {
		System.out.println("Car loan faciltity available in showroom");
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MetroCityShowroom car3 = new MetroCityShowroom();
		car3.carInsurance(); //instance method is called by creating object instance
		car3.carSales();
		carLoan(); //static method is called without creating object instance
		carService(); //static method is called without creating object instance
		
	}

}
