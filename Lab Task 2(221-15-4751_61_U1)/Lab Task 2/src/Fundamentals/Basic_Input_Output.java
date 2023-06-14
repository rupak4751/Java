package Fundamentals;

import java.util.Scanner;

public class Basic_Input_Output {
	
	public static void main(String[] args)
	{
		String grade;
		
		System.out.println("Enter Your Name:");
		
		Scanner scan = new Scanner(System.in);
		
		grade = scan.nextLine();
		System.out.println("Your Name is '" +grade+ "'!");
	}

}
