package assignment.selenium.variables;

import java.util.Scanner;

public class InstanceVariables {

	String companyName = "Next Gen A.I.";
	String companyLocation[] = {"Chennai","Hyderabad","Bangalore"};
	int mobileNumber;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstanceVariables associateOne = new InstanceVariables();
		Scanner scn = new Scanner(System.in);
        System.out.println("Enter the employee name:" );
        String empName = scn.nextLine(); 
        System.out.println("Associate name is " + empName);
        System.out.println("Associate one location is " + associateOne.companyLocation[0]);
        System.out.println("Associate company name is " + associateOne.companyName);
        System.out.println("Associate Mobile number is " + associateOne.mobileNumber);
        scn.close();
	}

}
