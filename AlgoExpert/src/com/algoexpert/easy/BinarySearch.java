package com.algoexpert.easy;

import java.util.Arrays;

public class BinarySearch {

	/**
	 * Method performs a binary search of the given array for the passed target
	 * value Returns -1 if not found else its index in the sorted array Below
	 * method uses recursion Time & Space complexity => O(log(n))
	 * 
	 * @param array
	 * @param target
	 * @return
	 */
	private static int binarySearch(int[] array, int target) {
		Arrays.sort(array);
		return binarySearchHelper(array, target, 0, array.length - 1);
	}

	private static int binarySearchHelper(int[] array, int target, int left, int right) {

		if (left > right)
			return -1;
		int middle = (left + right) / 2;
		int probableMatch = array[middle];
		if (probableMatch == target)
			return middle;
		else if (target > probableMatch) {
			return binarySearchHelper(array, target, middle + 1, right);
		} else {
			return binarySearchHelper(array, target, left, middle - 1);
		}
	}

	/**
	 * Iterative way * @param args
	 * Time Complexity = O(log(n))
	 * Space Complexity O(1)
	 */

	private static int binarySearchIterativeHelper(int[] array, int target, int left, int right) {

		// if (left > right)
		// return -1;
		while (left <= right) {
			int middle = (left + right) / 2;
			int probableMatch = array[middle];
			if (probableMatch == target)
				return middle;
			else if (target > probableMatch) {
				left = middle + 1;
			} else {
				right = middle - 1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		// ArrayList array = new ArrayList<>(Arrays.asList(0, 1, 21, 33, 45, 45,
		// 71, 61, 73, 72));
		int[] array = new int[] { 0, 1, 21, 33, 45, 45, 71, 61, 73, 72 };
		int target = 33;
		int index = binarySearch(array, target);
		System.out.println("Sorted array is: " + Arrays.toString(array));

		if (index == -1) {
			System.out.println("Target value " + target + " not found in given array");
		} else {
			System.out.println("Target value " + target + " found at index " + index);
		}
		
		System.out.println("Binary search using iterative method: ");
		int interative_index=binarySearchIterativeHelper(array, target, 0, array.length-1);
		System.out.println("Found at index: " + interative_index);
		

	}

}
