package com.greeks.linkedList;

public class L1TraverseLinkedList {
	
	public static void main(String[] args) {
		Node a = new Node(10);
		a.next = new Node(20);
		a.next.next = new Node(30);
		a.next.next.next = new Node(40);
		a.next.next.next.next = new Node(50);
		traverseLinkedList(a);
	}
	
	
	public static void traverseLinkedList(Node head) {
		
		Node curr = head;
		
		while(curr !=null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

}
