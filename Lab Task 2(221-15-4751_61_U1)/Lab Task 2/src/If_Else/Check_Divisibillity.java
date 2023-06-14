package If_Else;

import java.util.Scanner;

public class Check_Divisibillity {
	
	public static void main(String args [])
	{
		Scanner scan = new Scanner(System.in);
		
		int a;
		
		System.out.println("Enter a Number:");
		a= scan.nextInt();
		
		if((a % 5 == 0) && (a % 11 == 0))
	    {
	        System.out.println("Number is divisible by 5 and 11");
	    }
	    else
	    {
	        System.out.println("Number is not divisible by 5 and 11");
	    }
		
		
	}

}
