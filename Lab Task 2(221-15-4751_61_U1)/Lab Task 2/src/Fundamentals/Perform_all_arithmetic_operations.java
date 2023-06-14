package Fundamentals;

import java.util.Scanner;

public class Perform_all_arithmetic_operations {
	
	public static void main (String[]  args)
	{
		Scanner scan = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Enter two numbers:");
		a= scan.nextInt();
		b= scan.nextInt();
		
		double div = a/b;
		
		
		System.out.println("Sum = " +(a+b));
		System.out.println("Difference = " +(a-b));
		System.out.println("Product = " +(a*b));
		System.out.println("Quotient = " +(a/b));
		System.out.println("Modulus = " +(a%b));
	}

}
