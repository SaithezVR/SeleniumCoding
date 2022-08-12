package assignment.week1.controlstatements;

public class IfNested {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int i=40;
			int j=70;
			int k=100;

			if(i>j)
			{
				if(i>k)		  
				{
					System.out.println("The largest number of 3 numbers is " + i);
				}
				else
					System.out.println("The largest number of 3 numbers is " + k);
			} 
		
		else 
		{
			if (j>k)
				System.out.println("The largest of 3 numbers is " + j);
			else
				System.out.println("The largest of 3 numbers is " + k);
		}
	}
	}

