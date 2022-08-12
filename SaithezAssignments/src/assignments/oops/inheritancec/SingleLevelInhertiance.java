package assignments.oops.inheritancec;

public class SingleLevelInhertiance {
	
	//Writing program from Car showroom perspective in different cities
	
	public void carSales() {
		System.out.println("Cars are available for Sales");
	}
 
	public static void carService() {
		System.out.println("Car service is available");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleLevelInhertiance carOne = new SingleLevelInhertiance();
		carOne.carSales();
		carService();
		
		
		
		

	}

}
