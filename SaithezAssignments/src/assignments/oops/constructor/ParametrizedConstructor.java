package assignments.oops.constructor;

public class ParametrizedConstructor {
	
	 int integral;
	 
	ParametrizedConstructor(int i)
	{
		integral = i;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParametrizedConstructor obj = new ParametrizedConstructor(10);
        System.out.println(obj.integral);
	}

}
