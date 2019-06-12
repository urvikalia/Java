package com.algoexpert.extras;

import java.util.Arrays;



public class CheckFinal {

	public static void main(String[] args) throws Exception {
		String[] strings = new String[] { "Element1", "Element2" };
		ImmutableCollectionImpl<String> immutableCollection = new ImmutableCollectionImpl<String>(
				Arrays.asList(strings));
		immutableCollection.add("newElement");
		System.out.println(immutableCollection.size());
	}

}
