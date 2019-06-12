package com.algoexpert.easy;

public class FindLargestThreeNumbers {

	
	/*
	 * Time complexity => O(n)
	 * Space complexity => O(1)
	 */
	private static int[] findThreeLargest(int[] array) {
		int[] threeLargestArray = new int[] { -1, -1, -1 };
		for (int num : array) {
			updateThreeLargest(threeLargestArray, num);
		}
		return threeLargestArray;
	}

	private static void updateThreeLargest(int[] threeLargestArray, int num) {
		if (threeLargestArray[2] == -1 || num > threeLargestArray[2])
			update(threeLargestArray, num, 2);
		else if (threeLargestArray[1] == -1 || num > threeLargestArray[1])
			update(threeLargestArray, num, 1);
		else if (threeLargestArray[0] == -1 || num > threeLargestArray[0])
			update(threeLargestArray, num, 0);

	}

	private static void update(int[] threeLargestArray, int num, int index) {
		for (int i = 0; i <= index; i++) {
			if (i == index)
				threeLargestArray[i] = num;
			else {
				threeLargestArray[i] = threeLargestArray[i + 1];
			}
		}

	}

	public static void main(String[] args) {

		int[] array = new int[] { 12, 20, 9, 2, 5, 35, 100, 2 };
		int[] result = findThreeLargest(array);
		System.out.println("Three largest number in given array are :");
		for (int num : result)
			System.out.print(num + " ");

	}

}
