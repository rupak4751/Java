package Fundamentals;

import java.util.Scanner;

public class Compound_interest {
	
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		
		double a,b,c;
		
		System.out.println("Enter principle: ");
		a= scan.nextDouble();
		
		System.out.println("Enter Time: ");
		b= scan.nextDouble();
		
		System.out.println("Enter rate: ");
		c= scan.nextDouble();
		
		System.out.println("Simple Interest: " +a* (Math.pow((1 + c / 100), b)));

	}

}
