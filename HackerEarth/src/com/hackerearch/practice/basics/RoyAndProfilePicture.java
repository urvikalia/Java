package com.hackerearch.practice.basics;

import java.util.Scanner;

public class RoyAndProfilePicture {

	// accepts L, N , W and H as input
	public static void main(String[] args) {

		System.out.println("Enter input: ");

		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int n = sc.nextInt();

		for (int cnt = 0; cnt < n; cnt++) {
			int w = sc.nextInt();
			int h = sc.nextInt();

			if (w < l || h < l)
				System.out.println("UPLOAD ANOTHER");
			else if (w == h)
				System.out.println("ACCEPTED");
			else
				System.out.println("CROP IT");
		}

	}
}
