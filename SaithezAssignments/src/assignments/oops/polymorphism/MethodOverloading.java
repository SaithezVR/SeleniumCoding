package assignments.oops.polymorphism;

public class MethodOverloading {
	
	public static int multiply(int i, int j) {
		int mul = i*j;
		return mul;
	}

	public static int multiply(int i, int j,int k) {
		int mul = i*j*k;
		return mul;
	}
	
	public float multiply(float i, float j) {
		float mul = i*j;
		return mul;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(multiply(10,20)); //Static method called without creating object instance
		System.out.println(multiply(10,20,30));
		MethodOverloading mul1 = new MethodOverloading(); //Calling instance method
		System.out.println(mul1.multiply(25.0f,10.12f));
		
	}

}
