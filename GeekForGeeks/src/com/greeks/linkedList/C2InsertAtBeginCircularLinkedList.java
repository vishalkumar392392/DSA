package com.greeks.linkedList;

public class C2InsertAtBeginCircularLinkedList {

	public static void main(String[] args) {
		Node a = new Node(10);
		a.next = new Node(20);
		a.next.next = new Node(30);
		a.next.next.next = new Node(40);
		a.next.next.next.next = new Node(50);
		a.next.next.next.next.next = a;
		Node node = insertAtBegin(a, 5);
		C1TraversalCircularLinkedlist.traverseLinkedList(node);

	}

	public static Node insertAtBegin(Node head, int a) {

		Node node = new Node(a);

		node.next = head;
		Node curr = head;

		while (curr.next != head) {
			curr = curr.next;
		}
		curr.next = node;
		
		return node;

	}

}
