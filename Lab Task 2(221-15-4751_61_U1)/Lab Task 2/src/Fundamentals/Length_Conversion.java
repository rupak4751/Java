package Fundamentals;

import java.util.Scanner;

public class Length_Conversion {

	
	public static void main (String[]  args)
	{
		Scanner scan = new Scanner(System.in);
		
		int a;
		
		System.out.println("Enter length in centimeter: ");
		
		a= scan.nextInt();
		
		float c=(float) a/100;
		float b= (float) a/100000;
		
		System.out.println("Length in Meter: "+c );
		
		System.out.println("Length in K.M: " +b);


		
	}
}
