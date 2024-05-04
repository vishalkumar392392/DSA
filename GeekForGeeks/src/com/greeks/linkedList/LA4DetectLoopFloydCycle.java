package com.greeks.linkedList;

public class LA4DetectLoopFloydCycle {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = head.next.next;
		boolean isLoop = detectLoopFloyd(head);
		System.out.println(isLoop);
	}

	private static boolean detectLoopFloyd(Node head) {

		Node slowP = head;
		Node fastP = head;
				
		while(fastP !=null && fastP.next !=null) {
			
			slowP = slowP.next;
			fastP = fastP.next.next;
			if(slowP == fastP) {
				return true;
			}
		}
		
		return false;
	}

}
