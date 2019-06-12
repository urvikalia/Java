package com.hackerearch.practice.basics;

import java.util.Scanner;

public class Palindrome {

	
	public static void main(String[] args) {
		
		System.out.println("Enter String: ");
		
		Scanner sc =new Scanner(System.in);
		char[] S=sc.nextLine().toCharArray();
		
		int left =0;
		int right =S.length-1;
		
		boolean check=true;
		while(left <=right)
		{
			if(S[left]!=S[right])
			{
				check =false;
				break;
			}
			left++;
			right--;
		}
		if(check==false)
			System.out.println("NO");
		else
			System.out.println("YES");
	}
}
