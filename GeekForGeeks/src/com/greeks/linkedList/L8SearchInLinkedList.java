package com.greeks.linkedList;

public class L8SearchInLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		int output = searchLinkedlist(head,40);
		System.out.println(output);
//		L1TraverseLinkedList.traverseLinkedList(output);
	}

	public  static int searchLinkedlist(Node head, int k) {
		
		if(head == null) return 0;
		
		Node curr = head;
		
		int i = 1;
		
		while(curr !=null) {
			if(curr.data == k) {
				return i;
			}else {
				curr = curr.next;
			}
			i++;
		}
		
		

		return 0;
	}

}
