package assignment.oops.methods;

public class InstanceInvokingMethod {

	public int addition(int i,int j)
	{
		int result=i+j;
		return result;
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceInvokingMethod add1 = new InstanceInvokingMethod();
		int sum = add1.addition(10,20);
		add1.display(sum);		
		}

	private void display(int value) {
		// TODO Auto-generated method stub
		System.out.println("The value is " + value);
	}
	}


