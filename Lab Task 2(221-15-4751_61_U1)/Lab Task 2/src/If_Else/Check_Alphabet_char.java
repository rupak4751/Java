package If_Else;

import java.util.Scanner;

public class Check_Alphabet_char {
	public static void main(String args [])
	{
		Scanner scan = new Scanner(System.in);
		
		char ch;
		System.out.println("Eneter a charecter: ");
		
		ch= scan.next().charAt(0);
		
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
		{
			System.out.println("It is an Alphabet ");

		}
		else 
		{
			System.out.println("It is not an Alphabet ");

		}
	}

}
