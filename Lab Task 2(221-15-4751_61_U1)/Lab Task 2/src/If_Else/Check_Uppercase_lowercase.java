package If_Else;

import java.util.Scanner;

public class Check_Uppercase_lowercase {
	
	public static void main(String args [])
	{
		Scanner scan = new Scanner(System.in);
		
		char ch;
		System.out.println("Eneter a charecter: ");
		
		ch= scan.next().charAt(0);
		
		if(ch>='a' && ch<='z')
		{
			System.out.println("It is an Lower case Charecter ");

		}
		else if(ch>='A' && ch<='Z')
		{
			System.out.println("It is an Upper case  Charecter ");


		}
	}

}
