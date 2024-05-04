package com.geeks.linkedList;

public class C5DeleteKthNode {
	
	public static void main(String[] args) {
		Node a = new Node(10);
		a.next = new Node(20);
		a.next.next = new Node(30);
		a.next.next.next = new Node(40);
		a.next.next.next.next = new Node(50);
		a.next.next.next.next.next = a;
		Node node = deleteKNode(a,3);
		C1TraversalCircularLinkedlist.traverseLinkedList(node);

	}

	private static Node deleteKNode(Node head, int i) {

		Node curr = head;
		
		int a = 1;
		Node temp = null;
		while(curr.next !=head && a <i) {
			temp = curr;
			curr = curr.next;
			a++;
		}
		temp.next = curr.next;
		
		return head;
	}

}
