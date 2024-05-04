package com.geeks.linkedList;

public class LA6DeleteNodeWithOnlyPointerGiven {
	
	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		deleteNode(head.next.next);
		L1TraverseLinkedList.traverseLinkedList(head);
	}

	private static Node deleteNode(Node pointer) {
		
		Node next = pointer.next;
		pointer.data = next.data;
		pointer.next = pointer.next.next;
		
		return pointer;
	}

}
