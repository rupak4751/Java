package Fundamentals;

import java.util.Scanner;

public class Find_area_of_triangle {

	public static void main (String[] args)
	{
		Scanner scan= new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("Enter base of the triangle: ");
		a= scan.nextInt();
		
		System.out.println("Enter base of the triangle: ");
		b= scan.nextInt();
		
		System.out.println("Area of the triangle = " + 0.5*a*b + " sq. units");

	}
}
