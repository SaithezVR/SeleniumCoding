package assignments.oops.inheritancec;

public class LorryShowroomVillage extends VillageShowroom{
	/*Hierarichal Inheritance
	 * Sibling of LorryShowroomVillage is UrbanShowroom class
	 */
	
	
	public int NoOfVehicles(int i) //Instance method returning value
	{ 
		System.out.println("No of vehicles available in showroom for sale is" + i);
		return i;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LorryShowroomVillage lorry = new LorryShowroomVillage(); //Creating object instance
		lorry.carSales(); //Calling instance method from Parent class VillageShowroom
		lorry.NoOfVehicles(100); //Calling instance method from current class LorryShowroomVillage
		carService();		// Callng static method from Parent class VillageShowroom
	}

}
