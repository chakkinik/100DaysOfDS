package com.hundred.days.ds3;

public class FindMiddleElementOfList {
	
	/*
	 *  two pointer apporach
	 * 
	 */
	
	
	public static Node findMiddleElement(Node head) {
		Node slowPointer=head;
		Node fastPointer=head;
		
		while(fastPointer!=null) {
			fastPointer= fastPointer.getNext();
			if( fastPointer!=null && fastPointer.getNext()!=null)
			{
				fastPointer=fastPointer.getNext();
				slowPointer=slowPointer.getNext();
			}
			
		}
		
		return slowPointer;
		
	}

}
