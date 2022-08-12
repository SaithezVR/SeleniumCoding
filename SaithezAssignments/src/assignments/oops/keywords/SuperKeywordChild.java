package assignments.oops.keywords;

public class SuperKeywordChild extends SuperKeywordParent {
	
	int i[]= {30,40};
	public int method1() {
		int sum2 = i[0]+i[1];
		return sum2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeywordChild obj = new SuperKeywordChild();
		int finalSum=obj.method1();
	//	System.out.println("Final sum " + super.finalSum);
		
	}

}
