package com.algoexpert.easy.linkedlist;

public class Node {

	private int value;
	private Node next;

	public Node(int value, Node next) {
		super();
		this.value = value;
		this.next = next;
	}

	public Node(int value) {
		super();
		this.value = value;
		this.next = null;

	}

	public int getValue() {
		return value;
	}

	public Node getNext() {
		return next;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	

}
