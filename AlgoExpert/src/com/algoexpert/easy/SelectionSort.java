package com.algoexpert.easy;

public class SelectionSort {

	public static void sort(int[] input) {
		int[] unsorted = input;
		int currentIndex = 0;
		int smallestIndex = 0;

		while (currentIndex < unsorted.length -1) {
			smallestIndex=currentIndex;
			for (int cnt = currentIndex+1; cnt < unsorted.length; cnt++) {
				if (unsorted[cnt] < unsorted[smallestIndex]) {
					smallestIndex = cnt;
				}
			}
			swap(unsorted, currentIndex, smallestIndex);
			currentIndex++;
		}
	
		print(unsorted);

	}

	private static void print(int[] unsorted) {
		for (int num : unsorted)
			System.out.print(num + " ");
		System.out.println();
	}

	private static void swap(int[] unsorted, int unsortedIndex, int selected) {
		int temp;
		temp = unsorted[unsortedIndex];
		unsorted[unsortedIndex] = unsorted[selected];
		unsorted[selected] = temp;
	}
	

	public static void main(String[] args) {
		sort(new int[] { 3, 4, 2, 1 ,7,8});
	}

}
