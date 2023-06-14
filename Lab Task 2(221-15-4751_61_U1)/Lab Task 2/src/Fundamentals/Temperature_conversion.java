package Fundamentals;

import java.util.Scanner;

public class Temperature_conversion {

	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		double a,b;
		
		System.out.println("Enter Temperature in Celsius: ");
		
		a= scan.nextDouble();
		
		b= (a* 9/5)+32;
		
		System.out.println(" Temperature in Farenheit will : " +b);
		
		
	}
}
