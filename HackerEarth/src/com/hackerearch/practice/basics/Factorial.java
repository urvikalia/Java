package com.hackerearch.practice.basics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Input");
		
		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();
		
		int prod=1;
		for(int i=1;i<=N;i++)
		{
			prod =prod *i;
		}
		System.out.println(prod);
		
		// this was the top performer code 
		//
//		Scanner sc =new Scanner(System.in);
//		int N = sc.nextInt();
//		
//		int factorial=N ;
//		for(int i=N-1;i>=1;i--)
//		{
//			factorial =factorial *i;
//		}
//		System.out.println(factorial);
	}
}
