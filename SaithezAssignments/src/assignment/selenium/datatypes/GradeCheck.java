package assignment.selenium.datatypes;

import java.util.Scanner;

public class GradeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your marks");
		int mark = scn.nextInt();
		if (mark>=80 && mark<=100)
			System.out.println("Your Grade is O");
		else if (mark>=75 && mark<=79 )
			System.out.println("Grade is A");
		else if (mark>=70 && mark<=74 )
			System.out.println("Grade is B");
		else if (mark>=60 && mark<=69 )
			System.out.println("Grade is C");
		else if (mark>=50 && mark<=59 )
			System.out.println("Grade is D");
		else if (mark>=45 && mark<=49 )
			System.out.println("Grade is E");
		else if (mark<=44 && mark>=40 )
			System.out.println("Grade is P");
		else
			System.out.println("Your Grade is Fail");
		scn.close();
}
}