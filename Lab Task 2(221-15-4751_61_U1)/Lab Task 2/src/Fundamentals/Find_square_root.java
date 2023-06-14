package Fundamentals;

import java.util.Scanner;

public class Find_square_root {

	public static void main (String args[])
	{
	  Scanner scan = new Scanner(System.in);
	  
	  int a;
	  System.out.println("Enter a number:");
	  a= scan.nextInt();
	  
	  System.out.println("Square root of this number is: " +(Math.sqrt(a)));

	
	}
}
