package Logical_Programs;

import java.util.Scanner;

public class PalindromeString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter you string");
		
		String org = sc.next();
		
		String rev = "";
		
		int len = org.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		
		System.out.println("Original String: "+org);
		
		System.out.println("Reverse String: "+rev);
		
		if(org.equals(rev))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
}
