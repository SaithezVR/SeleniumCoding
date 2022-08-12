package assignment.oops.methods;

public class VariablesRules {
	
	int a =10; //Instance variable
	static int b=20; //static variable
	static int c =30; //static variable 
	
	public static void display() //static method
	{
		System.out.println("Static variable value is " + b);
		System.out.println("Second static variable value is "+ c);
	}
	
	public int increment(int a) //instance method
	{
		a=a+10;
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		display();// Creating instance of an object is not needed for static method
		
		VariablesRules inc = new VariablesRules(); //creating instance of an object for an instancec method
		int inc1=inc.increment(21);
		System.out.println("the value of incremented number is " + inc1);
				

	}

}
