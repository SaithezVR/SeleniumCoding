package assignments.oops.polymorphism;

public class SubClassOverriding extends ParentClassOverRiding   {
	
	public static float stockprice(float price)
	{
		float price1 = price+100; //Overiding the price in child class to get profit
		return price1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("The stock price is " + stockprice(350.0f));

	}

}
