package com.hackerearch.practice.basics;

import java.util.Scanner;

public class TestClass {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String number = sc.nextLine().trim();
		int N = Integer.parseInt(number);
		String S =sc.nextLine();
		System.out.println(N*2);
		System.out.println(S);
	}
}
