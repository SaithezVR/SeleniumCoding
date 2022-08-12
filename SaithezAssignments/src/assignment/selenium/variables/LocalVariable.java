package assignment.selenium.variables;

import java.util.Scanner;

public class LocalVariable {

	String productName ="Soap";	
	int price[]= {20,25,30};
	static String manfacturer = "Hindustan Lever";
	// Program to display the price of the product using all types of variables in the program
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String brandName[]= {"Hamam","Lux","Cinthol"};
		System.out.println("The manfacturer name is " + manfacturer);
		LocalVariable product1 = new LocalVariable();		
		System.out.println("The product is " + product1.productName);

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Brand that you are looking for :");
		String askBrand = scn.nextLine();	
		if(askBrand.equalsIgnoreCase(brandName[0]))
		{
			System.out.println("The brand and price of the soap is " + brandName[0] +  " & "  + product1.price[0] );
		}
		else if (askBrand.equalsIgnoreCase(brandName[1]))
		{
			System.out.println("The brand and price of the soap is " + brandName[1]+ "&" + product1.price[1] );
		}
		else if(askBrand.equalsIgnoreCase(brandName[2]))
		{
			System.out.println("The brand and price of the soap is " + brandName[2]+ "&" + product1.price[2] );
		}
		else
		{
			System.out.println("Stock of the brand is not available at our store");
		}
		scn.close();
	}

}
