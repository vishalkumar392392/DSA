package com.geeks.linkedList;

public class L4InsertEndLinkedList {
	
	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		insertEnd(head, 60);
	}

	public static void insertEnd(Node head, int i) {
		
		Node curr = head;
		
		while(curr.next !=null) {
			curr = curr.next;
		}
		curr.next = new Node(i);
		
		L1TraverseLinkedList.traverseLinkedList(head);
		
	}

}
