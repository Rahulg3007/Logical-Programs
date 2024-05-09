package Logical_Programs;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number:");
		
		int num = sc.nextInt();
		
		//Logic 1 = using Stringbuffer class
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		
		StringBuffer rev = sb.reverse();
		
		System.out.println("Reverse number is: "+rev);
		
		
	}

}
