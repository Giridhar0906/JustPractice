//package com.java;

//import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		int num=6;
		//Scanner sc = new Scanner (System.in);
		//System.out.println("enter num :- ");
		//int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{ 
			
	        for(int j=num;j>=i;j--)
	    {
			System.out.print(" * ");
		}
	        System.out.println();
	    }
		 System.out.println();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
		}
			System.out.println();
		}
//		int n=4;
//		
//		for(int i=1;i<=n;i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}System.out.println();
//
//		}
//		Scanner sc = new Scanner(System.in);
//		System.out.println("print your first number :-");
//		int n=sc.nextInt();
//		//int n=5;
//		//int m=4;
//		for(int i=n; i>=1; i--)  {
//			for(int j=1; j<=i; j++)
//			 {
//				System.out.print("*");
//			} System.out.println();
//			
//		}
	}

}