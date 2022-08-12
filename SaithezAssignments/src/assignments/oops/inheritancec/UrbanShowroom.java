package assignments.oops.inheritancec;

public class UrbanShowroom extends VillageShowroom {
	
	//Single level inheritence
  
	public void carInsurance() {
		System.out.println("Car Insurance is available"); //New method is created in UrbanShowroom class
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UrbanShowroom car2 = new UrbanShowroom();
		car2.carSales(); // Method from VillageShowroom class is used by creating object instance
		carService();
		car2.carInsurance();

	}

}
