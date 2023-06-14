package If_Else;

import java.util.Scanner;

public class Maximum_of_two_numbers {
	
	public static void main(String args[])
	{
		Scanner scan= new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Enter two numbers: ");
		a= scan.nextInt();
		b= scan.nextInt();
		
		if(a>b)
		{
			System.out.println("Maximum= " +a);

		}
		else if(a==b)
		{
			System.out.println("Two numbers are equal ");

		}
		else 
		{
			System.out.println("Maximum= " +b);

		}

	}

}
