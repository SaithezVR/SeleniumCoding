package assignment.selenium.datatypes;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte smallestNumberOne = 24;
		/* One byte =8 bits
		 * Hence we are assigning 24 value to a variable smallestNumber with datatype byte
		 * Variable name is case sensitive and camel case needs to be followed
		 */				
		System.out.println("Smallest number is "+ smallestNumberOne);
		//This statement gives output the value assigned to variable smallestNumber

		//Integer data type
		int smallestNumberTwo = 129;
		/* int can accomodate 32 bits of memory
		 * 32 bits is four bytes
		 * int is the data type- shot form of Integer
		 */
		System.out.println("Integer value entered is " + smallestNumberTwo);
		//This prints the value of integervalue

		//long data type
		long GstIncomePerAnuum = 120000000;
		System.out.println("Income through GST per annum  in INR is " + GstIncomePerAnuum);
		/*long data type can accomodate 8bytes of memory
		 * Sysout statement prints the output entered by the user
		 */

		//float data type
		float goldPricePerGram = 4500.91f;
		System.out.println("Gold price per gram in INR is " + goldPricePerGram);
		/*float data type is used to handle decimal numbers mostly 6 to 7 decimals
		 * Even if decimal is not entered, it will consider .0
		 */

		//double data type
		double goldPricePerGraM = 4500d;
		//purposefully mentioned name as GraM(capital M) to denote that variable name is case sensitive
		//double is same as float but double handles 15 to 16 decimals
		System.out.println("Gold price per gram in INR is " + goldPricePerGraM );

		//boolean data type
		boolean assignmentCompleted = true;
		//boolean is a datatype that handles either true or false
		System.out.println("Statement Assignment completed is " + assignmentCompleted);
	}

}
