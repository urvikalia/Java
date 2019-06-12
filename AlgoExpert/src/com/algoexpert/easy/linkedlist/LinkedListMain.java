package com.algoexpert.easy.linkedlist;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList linkedList=new LinkedList(new Node(2));
		linkedList.append(5);
		linkedList.append(6);
		linkedList.append(7);
		linkedList.append(8);
		linkedList.print();
		System.out.println("Finding 7: " + linkedList.find(7));
		
	}
}
