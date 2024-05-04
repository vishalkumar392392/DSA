package com.greeks.linkedList;

public class C3InsertAtEndCircularLinkedList {

	public static void main(String[] args) {
		Node a = new Node(10);
		a.next = new Node(20);
		a.next.next = new Node(30);
		a.next.next.next = new Node(40);
		a.next.next.next.next = new Node(50);
		a.next.next.next.next.next = a;
		Node node = insertAtEnd(a, 60);
		C1TraversalCircularLinkedlist.traverseLinkedList(node);

	}

	public static Node insertAtEnd(Node head, int i) {
		
		Node curr = head;
		
		while(curr.next !=head) {
			curr = curr.next;
		}
		Node node = new Node(i);
		curr.next = node;
		node.next =head;
		
		
		return head;
	}
}
