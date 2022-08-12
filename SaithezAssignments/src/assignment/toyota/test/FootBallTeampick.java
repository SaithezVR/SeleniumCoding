package assignment.toyota.test;

import java.util.Scanner;

public class FootBallTeampick {

	static int ik;
	static int jk;		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the inputs");
		ik= scn.nextInt();
		jk= scn.nextInt();
		scn.close();
		int arr[]= new int[ik];
		int temp[] = new int[ik];
		int len = arr.length;

		for(int i=0;i<ik;i++)
		{
			arr[i]=i;
			//System.out.println(arr[i]);
		}
		
		
		for(int i=0;i<len;i++)
			{
				temp[i]=arr[i+jk-1];
				System.out.println(temp[i]);
				len--;
				i=i+jk-1;
				
					
			}
			
		
		}
}


