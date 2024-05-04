package com.geeks.linkedList;

public class L6DeleteFirstNodeLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		Node output = deleteFirstNode(head);
		L1TraverseLinkedList.traverseLinkedList(output);

	}

	public static Node deleteFirstNode(Node head) {

		if (head == null)
			return head;
		return head.next;
	}

}
