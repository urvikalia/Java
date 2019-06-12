package com.algoexpert.easy;

public class CaesarCipherEncryptor {

	private static String caesarCypherEncryptor(String str, int key) {
		key = key % 26;
		char[] result = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			char chr = str.charAt(i);
			int newLetterCode = chr + key;
			char newChar = (newLetterCode <= 122 ? (char) (newLetterCode) : (char) (96 + newLetterCode % 122));
			result[i] = newChar;
		}
		return new String(result);
	}

	public static void main(String[] args) {
		System.out.println("Caesar Cypher Entryptor");
		String str = "xyz";
		int key = 2;
		String result = caesarCypherEncryptor(str, key);
		System.out.println("Result: " + result);
	}
}
