package com.hackerearch.practice.basics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("input");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			int fact = 0;
			for (int j = 1; j <= num; j++) {
				if (i % j == 0)
					++fact;
			}
			if (fact == 2) {
				System.out.print(i + " ");
			}
		}
	}
}
