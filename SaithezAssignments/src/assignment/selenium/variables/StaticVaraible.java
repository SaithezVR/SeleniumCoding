
package assignment.selenium.variables;

import java.util.Scanner;

public class StaticVaraible {
	
	// TODO Auto-generated method stub
	static String companyName = "Next Gen A.I.";
	static String companyLocation[] = {"Chennai","Hyderabad","Bangalore"};
	static int mobileNumber;
	static String empName;
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner scn = new Scanner(System.in);
	        System.out.println("Enter the employee name:" );
	        empName = scn.nextLine(); 
	        System.out.println("Associate name is " + empName);
	        System.out.println("Associate one location is " + companyLocation[1]);
	        System.out.println("Associate company name is " + companyName);
	        System.out.println("Associate Mobile number is " + mobileNumber);
	        scn.close();
		}

	
	}


