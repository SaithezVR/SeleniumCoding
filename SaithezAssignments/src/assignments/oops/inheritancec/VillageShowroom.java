package assignments.oops.inheritancec;

public class VillageShowroom {

	//Writing program from Car showroom perspective in different cities
	//Parent class

	public void carSales() {
		System.out.println("Cars are available for Sales");
	}

	public static void carService() {
		System.out.println("Car service is available");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VillageShowroom carOne = new VillageShowroom();
		carOne.carSales();
		carService();


}

}
