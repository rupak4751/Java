package Loop;

import java.util.Scanner;

public class Print_natural_num_1_to_n {

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a numbers: ");
		int a= scan.nextInt();
		int i;
		for(i=1; i<=a; i++)
		{
			System.out.print( i + " " );

		}
		
	}
	
}
