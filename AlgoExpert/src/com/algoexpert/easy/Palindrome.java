package com.algoexpert.easy;

public class Palindrome {
 
	/*
	 * Simply reverse string and compare it with original
	 * Space complexity = O(n)
	 * Time complexity => o(n^2) / O(n)
	 */
	private static boolean approach1(String input)
	{
		
		String reverseString="";
		for(int cnt =input.length()-1;cnt>=0;cnt--)
			reverseString =reverseString + input.charAt(cnt);
		if(input.equals(reverseString))
			return true;
		
		return false;
	}
	
	/*
	 * An optimal approach would be to traverse the string and don not
	 * use extra storage 
	 * Time complexity = O(n)
	 * Space complexity = O(1)
	 */
	private static boolean approach3(String input)
	{
		int leftindex=0, rightindex =input.length()-1;
		while(leftindex < rightindex)
		{
			if(input.charAt(leftindex)!= input.charAt(rightindex))
				return false;
			
			leftindex ++;
			rightindex--;
			
		}
		return true;
	}

	public static void main(String[] args) {
		String input ="madam";
		boolean palindromeCheck = approach3(input);
		System.out.println(palindromeCheck);
	}
}
