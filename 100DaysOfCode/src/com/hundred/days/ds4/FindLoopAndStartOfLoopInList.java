package com.hundred.days.ds4;

import com.hundred.days.ds3.Node;

/*
 * How to detect a loop in Linked List. 
 * If Linked List has loop, find the start node for the loop.
 */

public class FindLoopAndStartOfLoopInList {
	
	static Node loopPoint=null;

	public static  Node isLoopExits(Node node) {

		Node slowPointer = node;
		Node fastPointer = node;
		
		boolean loopExits=false;

		while (fastPointer != null) {
			fastPointer = fastPointer.next;

			if (fastPointer != null) {
				fastPointer = fastPointer.next;
			}
			slowPointer = slowPointer.next;

			if (slowPointer.equals(fastPointer)) {
				//loopPoint=slowPointer;
				loopExits=true;
				break;
				
			}
			
			if(loopExits) {
				
				slowPointer=node;
				while(!slowPointer.equals(fastPointer)) {
					slowPointer=slowPointer.next;
					fastPointer=fastPointer.next;
				}
			}

		}

		return slowPointer;
	}

	public static void main(String[] args) {

		Node loop = new Node(7);
		Node head = new Node(5);
		head.next = new Node(6);
		head.next.next = loop;
		head.next.next.next = new Node(8);
		head.next.next.next.next = loop;
		
		Node loopExits = isLoopExits(loop);
		System.out.println("===>"+ loopExits.element);
		
		//System.out.println(loopPoint.element);
	}

}
