package Loop;

import java.util.Scanner;

public class PRINT_SUM_1_TO_100 {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		int i;
		System.out.println("Enter upper limit: ");

		int n= scan.nextInt();
		int sum=0;
		for(i=1; i<=n; i++)
		{
			sum=sum+i;

		}
		System.out.println("The sum is " +sum);
		
	}

}
