package If_Else;

import java.util.Scanner;

public class Maximum_of_three_numbers {
	
	public static void main(String args[])
	{
		Scanner scan= new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Enter three numbers: ");
		a= scan.nextInt();
		b= scan.nextInt();
		c= scan.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("Maximum= " +a);

		}
		else if(b>a && b>c)
		{
			System.out.println("Maximum= " +b);

		}
		else 
		{
			System.out.println("Maximum= " +c);

		}
	}
}
