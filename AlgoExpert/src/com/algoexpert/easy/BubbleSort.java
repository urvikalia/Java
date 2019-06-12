package com.algoexpert.easy;

public class BubbleSort {

	/**
	 * Space complexity = O(1)
	 * Time complexity = O(n^2)
	 * @param array
	 * @return
	 */
	public static int[] bubbleSort(int[] array) {
		boolean isSorted= false;
		int counter=0;
		while (!isSorted)
		{
			isSorted=true; 
			for(int i=0;i<array.length-1- counter;i++)
			{
				if(array[i]>array[i+1])
				{
					int temp=array[i+1];
					array[i+1]=array[i];
					array[i]=temp;
					isSorted=false;
				}
				
			}
			counter=counter+1;
		}
		
		return array;
	  }
	
	public static void main(String[] args) {
		System.out.println("Buble Sort: ");
		int[] array =new int[]{2,5,3,1,10,8,9,6};
		int [] sortedArray=bubbleSort(array);
		System.out.println("Sorted Array: ");
		for(int num:sortedArray)
		{
			System.out.print(num + " ");
		}
	}
}
