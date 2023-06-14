package If_Else;

import java.util.Scanner;

public class Check_neg_pos_zero {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		int a;
		
		System.out.println("Enter a number: ");
		a= scan.nextInt();
		
		if(a==0)
		{
			System.out.println("The number is Zero");
		}
		else if(a>0)
		{
			System.out.println("The number is Positive");
		}
		else 
		{
			System.out.println("The number is Negetive");

		}
		
		
	}

}
