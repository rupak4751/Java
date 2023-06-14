package Loop;

import java.util.Scanner;

public class Print_of_all_odd_numbers_1_to_n {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		int i;
		System.out.println("Enter upper limit: ");

		int n= scan.nextInt();
		int sum=0;
		for(i=1; i<=n; i++)
		{
			if(i%2!=0)
			{
			sum=sum+i;
			}

		}
		System.out.println("The sum is " +sum);
		
	}

}
