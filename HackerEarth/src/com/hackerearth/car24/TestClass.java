package com.hackerearth.car24;
import java.util.Scanner;

class TestClass {
	public static void main(String args[]) throws Exception {
		System.out.println("Input");
		int T = 0;
		Scanner s = new Scanner(System.in);
		String testcase = "";
		while (testcase.equals(""))
			testcase = s.nextLine().trim();
		String size = "";
		int N = 0;
		int[] A = null;
		int sum = 0;
		T = Integer.parseInt(testcase);
		for (int cas = 0; cas < T; cas++) {

			size = "";
			while (size.equals(""))
				size = s.nextLine().trim();
			N = Integer.parseInt(size);

			A = new int[N];
			sum = 0;
			for (int cnt = 0; cnt < N; cnt++) {
				A[cnt] = s.nextInt();
				sum = sum + A[cnt];
			}

			if (sum % N != 0)
				System.out.println(-1);
			else {
				int x = sum / N;
				System.out.println(x);
			}
		}
	}
}
