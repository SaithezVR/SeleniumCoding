package assignment.week1.controlstatements;

public class BreakAndContinue {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int month =9;
		switch(month)
		{
		case(1):
			System.out.println("Month is Jan");

		case(2):
			System.out.println("Month is Feb");

		case(3):
			System.out.println("Month is Mar");

		case(4):
			System.out.println("Month is Apr");

		case(5):
			System.out.println("Month is May");

		case(6):
			System.out.println("Month is Jun");

		case(7):
			System.out.println("Month is Jul");

		case(8):
			System.out.println("Month is Aug");				
		case(9):
			System.out.println("Month is Sep");
		break;
		case(10):
			System.out.println("Month is OCt");
		case(11):
			System.out.println("Month is Nov");				
		case(12):
			System.out.println("Month is Dec");

		}
		System.out.println("*********************************");
		//PRogram to explain continue

		for (int i=1;i<=10;i++)   {
			
			if(i==6) {
				continue;//statements below continue will not be executed for the current iteration
			}
			System.out.println(i);
		}
	}		
}
