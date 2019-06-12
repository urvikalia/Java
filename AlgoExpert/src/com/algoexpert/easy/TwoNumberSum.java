package com.algoexpert.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {

	public static void main(String[] args) {
		int[] array = { 2, 4, 5, 8, 10 };
		int targetSum = 6;
		int[] result = twoNumberSum(array, targetSum);

		System.out.println("Appoach 1");
		System.out.println("TargetSum will be achived by adding follwoing two numbers: ");
		Arrays.stream(result).forEach(num -> System.out.println(num));

		result = twoNumberSum_second(array, targetSum);
		System.out.println("Appoach 2");
		Arrays.stream(result).forEach(num -> System.out.println(num));
		
		result = twoNumberSum_third(array, targetSum);
		System.out.println("Appoach 3");
		Arrays.stream(result).forEach(num -> System.out.println(num));
	}

	/*
	 * This seams to be the rawest execution of the functionality I think this
	 * is the result of programming mindset
	 * 
	 * Needs to be optimized
	 */
	public static int[] twoNumberSum(int[] array, int targetSum) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == targetSum) {
					return array[i] > array[j] ? new int[] { array[j], array[i] } : new int[] { array[i], array[j] };
				}
			}
		}
		return new int[0];

	}

	/*
	 * returns array of two numbers whose sum is given targetsum It uses list to
	 * store the traversed value Time Complexity = O(n) Space Complexity = O(n)
	 */

	public static int[] twoNumberSum_second(int[] array, int targetSum) {
		Map<Integer, Boolean> nums = new HashMap<>();
		for (int num : array) {
			int potentialMatch = targetSum - num;
			if (nums.containsKey(potentialMatch)) {
				return potentialMatch > num ? new int[] { num, potentialMatch } : new int[] { potentialMatch, num };
			} else {
				nums.put(num, true);
			}
		}
		return new int[0];

	}
	/*
	 * optimized execution 
	 * Time Complexity =>  O(nlogn)
	 * Space complexity => O(1)  
	 */
	public static int[] twoNumberSum_third(int[] array, int targetSum) {
		Arrays.sort(array);
		int left=0;
		int right=array.length-1;
		
		while(left<right)
		{
			int sum = array[left]+array[right];
			if(sum==targetSum)
			{
				return new int[]{array[left],array[right]}; 
			}
			else
			{
				if(sum<targetSum)
					left++;
				else
					right--;
			}
		}
		return new int[0];
	}
}
