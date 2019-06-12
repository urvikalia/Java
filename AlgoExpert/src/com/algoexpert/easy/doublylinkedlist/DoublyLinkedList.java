package com.algoexpert.easy.doublylinkedlist;

public class DoublyLinkedList {

	private Node head;
	private Node tail;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public void insertBefore(Node node, Node nodeToInsert) {
		if (node.getPrev() == null) {

			nodeToInsert.setNext(node);
			nodeToInsert.setPrev(null);
			node.setPrev(nodeToInsert);
			setHead(nodeToInsert);
		} else {
			nodeToInsert.setNext(node);
			nodeToInsert.setPrev(node.getPrev());
			node.getPrev().setNext(nodeToInsert);
			node.setPrev(nodeToInsert);
		}
	}

	public void insertAfter(Node node, Node nodeToInsert) {
		if (node.getNext() == null) {
			nodeToInsert.setNext(null);
			node.setNext(nodeToInsert);
			nodeToInsert.setPrev(node);
		} else {
			nodeToInsert.setPrev(node);
			nodeToInsert.setNext(node.getNext());
			node.setNext(nodeToInsert);
		}

	}

	public void removeNodeWithValue(int value) {
		Node current = findNodewithValue(value);
		removeNode(current);
	}

	public void removeNode(Node node) {

		Node prev = node.getPrev();
		Node next = node.getNext();

		if (prev == null) {
			head = head.getNext();
			head.setPrev(null);
		} else if (next == null) {
			tail = tail.getPrev();
			tail.setNext(null);
		}

		else {
			prev.setNext(next);
			next.setPrev(prev);
		}
		node = null;
	}

	public boolean containsNodeWithValue(int value) {
		Node node = findNodewithValue(value);
		if (node == null)
			return false;
		else
			return true;
	}

	private Node findNodewithValue(int value) {
		Node current = head;
		while (current != null) {
			if (current.getValue() == value)
				break;
			current = current.getNext();
		}
		return current;
	}

	public void print() {
		Node current = head;
		while (current != null) {
			System.out.print(current.getValue() + "  ");
			current = current.getNext();
		}
		System.out.println();
	}

}
