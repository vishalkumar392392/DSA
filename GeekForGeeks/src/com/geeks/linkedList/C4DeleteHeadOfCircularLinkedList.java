package com.geeks.linkedList;

public class C4DeleteHeadOfCircularLinkedList {

	public static void main(String[] args) {
		Node a = new Node(10);
		a.next = new Node(20);
		a.next.next = new Node(30);
		a.next.next.next = new Node(40);
		a.next.next.next.next = new Node(50);
		a.next.next.next.next.next = a;
		Node node = deleteHead(a);
		C1TraversalCircularLinkedlist.traverseLinkedList(node);

	}

	public static Node deleteHead(Node head) {

		Node curr = head;
		Node temp = head.next;

		while (curr.next != head) {
			curr = curr.next;
		}

		curr.next = temp;

		return temp;
	}

}
