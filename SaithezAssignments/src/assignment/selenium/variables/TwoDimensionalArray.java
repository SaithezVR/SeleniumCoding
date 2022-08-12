package assignment.selenium.variables;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array [][] = new int [3][3];
		int i,j;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				array[i][j]=i*j;
				
			}			
		
		}
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.println(array[i][j] + " ");
			
			}
			System.out.println();
		}

	}

}
