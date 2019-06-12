package com.algoexpert.easy.linkedlist;

public class LinkedList {

	private Node head;

	public LinkedList(Node head) {
		super();
		this.head = head;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node findNode(int value) {
		Node current = head;
		while (current != null) {
			if (current.getValue() == value)
				return current;
			current = current.getNext();
		}
		return null;
	}

	public boolean find(int value) {
		return (findNode(value) == null) ? false : true;
	}

	public void addAfter(Node node, int valueToInsert) {
		Node nodeToInsert = new Node(valueToInsert);
		nodeToInsert.setNext(node.getNext());
		node.setNext(nodeToInsert);
	}

	public void append(int value) {
		Node lastNode = findLast();
		Node newNode = new Node(value);
		lastNode.setNext(newNode);
	}

	public Node findLast() {

		Node current = head;
		boolean flag = false;
		while (current != null) {
			if (current.getNext() == null)
				return current;
				current = current.getNext();
		}

		return current;
	}

	public void print() {
		Node current = head;
		while (current != null) {
			System.out.print(current.getValue() + " -> ");
			current = current.getNext();
		}
		System.out.println();
	}

}
