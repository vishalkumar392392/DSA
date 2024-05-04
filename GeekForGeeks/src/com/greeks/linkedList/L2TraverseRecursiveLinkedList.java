package com.greeks.linkedList;

public class L2TraverseRecursiveLinkedList {
	
	
	public static void main(String[] args) {
		Node a = new Node(10);
		a.next = new Node(20);
		a.next.next = new Node(30);
		a.next.next.next = new Node(40);
		a.next.next.next.next = new Node(50);
		traverseRecursiveLinkedList(a);
	}

	private static void traverseRecursiveLinkedList(Node head) {
		
		if(head == null) {
			return;
		}
		System.out.print(head.data +" ");
		traverseRecursiveLinkedList(head.next);
		
	}

}
