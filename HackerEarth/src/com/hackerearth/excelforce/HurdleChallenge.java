package com.hackerearth.excelforce;

import java.util.Scanner;

public class HurdleChallenge {

	private static String crossHurdle(int[] heights, long power) {
		String msg = "Yes ";
		int time = 0;
		boolean evencheck = false;

		while (power > 0 && time < heights.length) {

			if (time == 0 || time == 1) {
				evencheck = (time == 0) ? true : false;
				evencheck = time == 1 ? false : true;
			} else {
				evencheck = time % 2 == 0 ? true : false;
			}

			power = power - heights[time];
			for (int counter = time + 1; counter < heights.length; counter++) {
				if (evencheck) {
					heights[counter] = heights[counter] % 2 == 0 ? heights[counter] - 1 : heights[counter];
				} else {
					heights[counter] = heights[counter] % 2 != 0 ? heights[counter] - 1 : heights[counter];
				}
			}
			System.out.println("-----------------------------");
			System.out.println("Time:  " + time);
			System.out.println("power: " + power);
			for (int cnt = time; cnt < heights.length; cnt++) {
				System.out.print(heights[cnt] + " ");
			}
			System.out.println();
			System.out.println("----------------------------");
			time++;
		}
		System.out.println(time);
		if(time < heights.length)
			msg = "No";
		else
			msg = msg + power;
		return msg;
	}

	public static void main(String[] args) {
		System.out.println("Enter input...");

		Scanner sc = new Scanner(System.in);
		String testcase = "";
		while (testcase.equals(""))
			testcase = sc.nextLine().trim();

		int n = Integer.parseInt(testcase);
		for (int i = 0; i < n; i++) {
			int N = sc.nextInt();
			long power = sc.nextLong();
			int[] heights = new int[N];

			for (int cnt = 0; cnt < N; cnt++) {
				heights[cnt] = sc.nextInt();
			}
			String msg = crossHurdle(heights, power);
			System.out.println(msg);
		}
	}
}
