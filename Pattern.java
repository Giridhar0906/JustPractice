//package com.java;

//import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		int num=6;
		
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

	}

}