package com.algoexpert.easy.doublylinkedlist;

public class DoublyLinkedListMain {

	public static void main(String[] args) {
		DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
	   Node node1 =new Node(1);
	   Node node2 =new Node(2);
	   Node node3 =new Node(3);
	   Node node4 =new Node(4);
	   Node node5 =new Node(5);
	   Node node6 =new Node(6);
	   
	   doublyLinkedList.setHead(node1);
	   doublyLinkedList.insertAfter(node1, node2);
	   doublyLinkedList.insertAfter(node2, node3);
	   doublyLinkedList.setTail(node3);
	   doublyLinkedList.removeNodeWithValue(3);
	   doublyLinkedList.print();
	   doublyLinkedList.insertBefore(node1, node4);
	   doublyLinkedList.insertBefore(node2, node5);
	   doublyLinkedList.insertAfter(node2, node3);
	   doublyLinkedList.insertAfter(node4, node6);
	   
	   
	   doublyLinkedList.print();
	   
	   
	}
}
