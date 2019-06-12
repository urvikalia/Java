package com.hackerearch.practice.basics;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		System.out.println("Enter input");

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double answer = 1;
		final double  denominator = (Math.pow(10, 9) + 7);
		
		for (int cnt = 0; cnt < N; cnt++) {
			answer = (answer * sc.nextInt()) % denominator;
		}
		System.out.println(Math.round(answer));

	}
}
