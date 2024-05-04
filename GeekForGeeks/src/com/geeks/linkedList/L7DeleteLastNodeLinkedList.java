package com.geeks.linkedList;

public class L7DeleteLastNodeLinkedList {
	
	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		Node output = deleteLastNode(head);
		L1TraverseLinkedList.traverseLinkedList(output);

	}

	public static Node deleteLastNode(Node head) {
		
		Node curr = head;
		if(head == null) return head;
		while(curr.next.next !=null) {
			curr = curr.next;
		}
		
		curr.next = null;
		
		return head;
	}

}
