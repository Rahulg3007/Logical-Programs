package Logical_Programs;

import java.util.Scanner;

public class PalindromeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		
		int num = sc.nextInt();
		
		int orgNum = num;
		
		int rev = 0;
		
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num=num/10;
		}
		
		if(orgNum==rev)
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		
		
		
	}
}
