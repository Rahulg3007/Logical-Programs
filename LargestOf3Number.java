package Logical_Programs;

import java.util.Scanner;

public class LargestOf3Number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a = sc.nextInt();
		
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		System.out.println("Enter third number");
		int c = sc.nextInt();
//		
//		//Logic 1
//		
//		if(a>b && a>c)
//		{
//			System.out.println(a + " is the largest number");
//		}
//		else if(b>a && b>c)
//		{
//			System.out.println(b + " is the largest number");
//		}
//		else
//		{
//			System.out.println(c + " is the largest number");
//		}
		
		//Ternory Operator
		
//		int largest = a>b?a:b;
//		
//		largest = c>largest?c:largest;
		
		//we can also right program in single statement
		int largest2 = c>(a>b?a:b)?c:(a>b?a:b);
		
		System.out.println(largest2 + " is the largest number");
	}
}
