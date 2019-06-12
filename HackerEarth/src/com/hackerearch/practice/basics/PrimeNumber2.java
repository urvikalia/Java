package com.hackerearch.practice.basics;

import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		System.out.println("input");
		
		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();
		for(int num=2;num <N ;num++)
		{
			boolean prime =true;
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					prime=false;
					break;
				}
			}
			if(prime)
				System.out.print(num + " ");
		}
	}
}
