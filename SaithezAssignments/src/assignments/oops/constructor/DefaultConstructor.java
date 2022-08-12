package assignments.oops.constructor;

public class DefaultConstructor {
	
	int i=10;
	DefaultConstructor(){
		System.out.println("Construcotr is called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
          DefaultConstructor obj = new DefaultConstructor();          
           System.out.println("The value of i is " + obj.i);
	}

}
