package com.algoexpert.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 * Code to compute nth value in fibonacci series
 * @author urvi
 *
 */
public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Invoking method : getNthFib_first");
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the value for n: ");
		int n = scanner.nextInt();
		int ans = getNthFib_first(n);
		scanner.close();
		System.out.println("Value of Nth element in the fibonacci series is: " + ans);

		// Approach 2
		Map<Integer, Integer> map = new HashMap<>();
		ans = getNthFib_second(8, map);
		System.out.println("Result from second approach is: " + ans);

		
		//Approach 3 
		System.out.println("Result from Optimized approach is: "+ getNthFib_third(n));
	}

	/*
	 * Approach 1 Method calculates nth number in the fibonacci series first
	 * approach where Time complexity is O(2^n) Space complexity is O(n)
	 */
	private static int getNthFib_first(int n) {
		if (n == 1)
			return 0;
		else if (n == 2)
			return 1;
		else {
			return getNthFib_first(n - 1) + getNthFib_first(n - 2);
		}
	}

	/*
	 * Approach 2 
	 * Time complexity => O(n) 
	 * Space complexity => O(n) 
	 */
	private static int getNthFib_second(int n, Map<Integer, Integer> map) {
		if (map.isEmpty()) {
			map.put(1, 0);
			map.put(2, 1);
		}

		if (map.containsKey(n)) {
			return map.get(Integer.valueOf(n));
		} else {
			map.put(n, getNthFib_second(n - 1, map) + getNthFib_second(n - 2, map));
			Integer value = map.get(Integer.valueOf(n));
			return value;
		}

	}

	/*
	 * Approach 3
	 * Time complexity => O(n) 
	 * Space complexity => O(1) 
	 */
	private static int getNthFib_third(int n) {
		int[] last_two = { 0, 1 };
		int counter = 3;
		int next = 0;
		while (counter <= n) {
			next = last_two[0] + last_two[1];
			last_two[0] = last_two[1];
			last_two[1] = next;
			counter++;
		}
		return n == 1 ? last_two[0] : last_two[1];
	}
}
