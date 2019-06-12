package com.hackerearch.practice.basics;

import java.util.Scanner;

public class ToggleString {

	public static void main(String[] args) {
		System.out.println("Enter String: ");

		Scanner sc = new Scanner(System.in);
		char[] S = sc.nextLine().toCharArray();

		for (int i = 0; i < S.length; i++) {

			if (S[i] <= 90) {
				S[i] = (char) (S[i] + 32);
			}

			else
				S[i] = (char) (S[i] - 32);
		}
		System.out.println(new String(S));
		System.out.println("Hello Kirti");
	}
}
