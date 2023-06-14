package Fundamentals;
import java.util.Scanner;
	
public class Calculate_Simple_interest {
	
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
		
		System.out.println("Simple Interest: " +(a*b*c)/100);

	}

}
