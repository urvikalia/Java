package com.hackerearch.practice.basics;

import java.util.Scanner;

public class CountDivisors {

	/*
	 * Accepts i,r and K. find the numbers between 
	 * i and r (inclusive) which are divisible
	 * by k. Display the count only 
	 */
	public static void main(String[] args) {
		
		System.out.println("Enter input: ");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int r=sc.nextInt();
		int k =sc.nextInt();
		
		int cnt=0;
		for(int num=i;num<=r;num++)
		{
			if(num%k==0)
				cnt++;
		}
		System.out.println(cnt);
	}
}
