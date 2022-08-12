package assignment.oops.methods;

public class StaticWithoutInvokingMethod {
	
	public static double multiplication(double i,double j)
	{
		double mul = i*j;
		return mul;
	}
	
	private static void display(double value)
	{
		System.out.println("The multiplication of two numbers is " + value);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double mulFinal = multiplication(20.5,9.0);
		display(mulFinal);
	}

}
