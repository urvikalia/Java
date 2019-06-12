package com.algoexpert.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeNumberSum {

	/*
	 * Method takes in array of numbers and target Sum
	 * One needs to find all the triplets within the array resulting the given target sum
	 * The easiest way would be to loop thrice 
	 * The optimal solution would be something as below 
	 * 
	 * Time Complexity  = O(n^2)  
	 * Space Complexity = O(n)
	 */
	private static ArrayList<Integer[]> threeNumberSum(int[] array, int targetSum) {
		ArrayList<Integer[]> result = new ArrayList<Integer[]>();
		Arrays.sort(array);

		for (int currentPointer = 0; currentPointer <= array.length - 2; currentPointer++) {
			int left = currentPointer + 1;
			int right = array.length - 1;

			while (left < right) {
				int currentSum = array[currentPointer] + array[left] + array[right];
				if (currentSum == targetSum) {
					Integer[] triplet = { array[currentPointer], array[left], array[right] };
					result.add(triplet);
					left++;
					right--;
				}

				else if (currentSum < targetSum)
					left++;

				else if (currentSum > targetSum)
					right--;
			}

		}
		return result;
	}

	public static void main(String[] args) {
		int[] input = { 12, 3, 1, 2, -6, 5, -8, 6 };
		int targetSum = 0;
		ArrayList<Integer[]> result = threeNumberSum(input, targetSum);
		for (Integer[] triplet : result) {
			System.out.println();
			for (int value : triplet) {
				System.out.print(value +" ");
			}
		}
	}
}
