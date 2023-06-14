package Fundamentals;

import java.util.Scanner;

public class Find_angles_of_triangles {

	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Enter First angle: ");
		a= scan.nextInt();
		
		System.out.println("Enter Second angle: ");
		b= scan.nextInt();
		
		System.out.println("The Third angle: " + (180-a-b));
			
	}
}
