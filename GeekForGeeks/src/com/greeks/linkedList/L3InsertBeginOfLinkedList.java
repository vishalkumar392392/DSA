package com.greeks.linkedList;

public class L3InsertBeginOfLinkedList {

	public static void main(String[] args) {
		Node a = new Node(10);
		a.next = new Node(20);
		a.next.next = new Node(30);
		a.next.next.next = new Node(40);
		a.next.next.next.next = new Node(50);
		insertBegin(a, 5);
	}

	public static void insertBegin(Node head, int k) {

		Node node = new Node(k);
		node.next = head;
		L1TraverseLinkedList.traverseLinkedList(node);

	}

}
