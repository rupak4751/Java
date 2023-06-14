package Loop;

import java.util.Scanner;

public class Print_multiplication_table {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a numbers: ");
		int a= scan.nextInt();
		int i;
		for(i=1; i<=10; i++)
		{
	
			System.out.printf("%d X %d = %d \n", a,i,a*i );
	
		}
		
	}

}
