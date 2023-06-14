package If_Else;

import java.util.Scanner;

public class Check_even_or_odd {

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		int a;
		System.out.println("Enter a number: ");

		a= scan.nextInt();
		
		if(a%2==0)
		{
			System.out.println("The number is Even");
		}
		
		else if(a==0)
		{
			System.out.println("The number is Zero");

		}
		else
		{
			System.out.println("The number is Odd");

		}
	}
}
