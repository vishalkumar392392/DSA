package com.geeks.linkedList.Doubly;

class Node {

	int data;
	Node prev;
	Node next;

	Node(int d) {
		data = d;
		prev = null;
		next = null;
	}

}

public class D2InsertAtBeginDoublyLinkedList {

	public static void main(String[] args) {

		Node head = new Node(10);
		Node temp1 = new Node(20);

		head.next = temp1;
		temp1.prev = head;

		Node temp2 = new Node(30);

		temp1.next = temp2;
		temp2.prev = temp1;

		Node temp3 = new Node(40);
		temp2.next = temp3;
		temp3.prev = temp2;

		Node temp4 = new Node(50);

		temp3.next = temp4;
		temp4.prev = temp3;
		
		Node node = insertAtBegin(head, 5);
		D1TraverseDoublyLinkedList.traverseDoublyLinkedList(node);
		

	}

	private static Node insertAtBegin(Node head, int i) {
		
		Node node = new Node(i);
		node.prev = null;
		node.next = head;
		head.prev = node;
		return node;
	}

}
