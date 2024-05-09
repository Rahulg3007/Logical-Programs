package Logical_Programs;

public class Swapping_Numbers 
{
	public static void main(String[] args) 
	{
		int a = 10;
		
		int b = 20;
		
		System.out.println("Before swapping values are: "+a+" "+b);
		
		//logic 1 - Third variable
		
//		int c=a;
//		a=b;
//		b=c;
//		
//		
		//logic 2 - Using + & -
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping values are: "+a+" "+b);
		
	}
}
