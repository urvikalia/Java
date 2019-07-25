package com.algoexpert.easy;


import java.util.Arrays;
import java.util.List;

//Not the most efficient one but easy to implement
/**
    Creating a space at start of the list , tentatively sorted list
    start from index 1 , and keep sorting it in the reverse order

 */
public class InsertionSort {


    private static int[] sort(int[] array) {
        int temp = 0;
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j] < array[j - 1]) {
                temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
                j = j - 1;
            }
        }
        return array;
    }

    public static void main(String[] args) {

        int[] array = {2, 5, 3, 1, 8, 9, 6, 3};
        int[] sortedArray = sort(array);

        System.out.println("Sorted array is: ");

        for(int num: sortedArray)
        {
            System.out.print(num + " ");
        }
    }
}
