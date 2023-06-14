package Fundamentals;

import java.util.Scanner; 

public class Basic_IO_in_all_data_type {
	
	public static void main (String[]  args)
	{
		
	String str;
	
	Scanner scan = new Scanner(System.in);
	
	
	System.out.println("Enter int ");
	int a = scan.nextInt(); 
	
	System.out.println("Enter float ");
	float b = scan.nextFloat();
	
	System.out.println("Enter double ");
	double c = scan.nextDouble();
	
	System.out.println("Enter sentence ");
	str = scan.nextLine();
	
	
	System.out.println("The int number is: " +a);
	System.out.println("The floating number is: " +b);
	System.out.println("The double number is: " +c);
	System.out.println("The Sentence is: "+str);
	System.out.println("Thanks ");
	
	}
	

}
