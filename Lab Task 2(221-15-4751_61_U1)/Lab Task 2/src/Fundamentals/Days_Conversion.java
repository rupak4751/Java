package Fundamentals;


import java.util.Scanner;

public class Days_Conversion {

	public static void main (String[]  args)
	
	{
		
		Scanner scan = new Scanner(System.in);
		
		int a,b,c,d;
		
		System.out.println("Enter days: ");
		
		a= scan.nextInt();
		
		b= a/365;
		c= (a%365)/7;
		d= a-((b*365)+(c*7));
		
		System.out.println("Years: " +b);
		System.out.println("Weeks: " +c );
		System.out.println("Days: " +d );



	}
}
