package assignments.oops.keywords;


public class SuperKeywordParent {
	
	int i[]= {10,20};	
	public int method() 
	{	
		int sum=i[0]+i[1];
		return sum;
	}

 public static void main(String[] args)
 {
	 SuperKeywordParent sum1 = new SuperKeywordParent();
	 int finalSum = sum1.method();
	 System.out.println("Final sum or two numbers is " + finalSum);
 }
}
