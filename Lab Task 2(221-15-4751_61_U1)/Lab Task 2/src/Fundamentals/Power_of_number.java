package Fundamentals;

import java.util.Scanner;

public class Power_of_number {

	public static void main(String[]  args)
	{
		Scanner scan= new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Enter Base: ");
		a=scan.nextInt();
		
		System.out.println("Enter Exponent: ");
		b=scan.nextInt();
		
		System.out.println(a+ "^" +b+ "=" +(Math.pow(a, b)) );
		
		
	}
}
