package Fundamentals;

import java.util.Scanner;

public class Area_of_a_rectangle {
	
	public static void main (String[]  args)
	{
		Scanner scan = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Enter Length: ");
		a= scan.nextInt();
		
		System.out.println("Enter Width: ");
		b= scan.nextInt();
		
		System.out.println("Area of Rectangle = " +(a*b));
		
	}

}
