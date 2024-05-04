package com.geeks.linkedList.Doubly;

public class D4DeleteHead {
	
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

		Node node = deleteHead(head);
		D1TraverseDoublyLinkedList.traverseDoublyLinkedList(node);

	}

	public static Node deleteHead(Node head) {
		Node curr = head.next;
		curr.prev = null;
		return curr;
	}

}
