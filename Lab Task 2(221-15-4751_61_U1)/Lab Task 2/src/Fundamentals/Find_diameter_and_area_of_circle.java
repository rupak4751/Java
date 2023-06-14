package Fundamentals;

import java.util.Scanner;

public class Find_diameter_and_area_of_circle {
	
	public static void main (String[]  args)
	{
		Scanner scan= new Scanner(System.in);
		
		int a;
		
		System.out.println("Enter Radius: ");
		a= scan.nextInt();
		
		System.out.println("Diameter: "+2*a + " units");
		System.out.println("Circumferenc: "+2*3.1416*a + " units");
		System.out.println("Area: " +3.1416*a*a + " sq. units");


		
		
		
	}

}
