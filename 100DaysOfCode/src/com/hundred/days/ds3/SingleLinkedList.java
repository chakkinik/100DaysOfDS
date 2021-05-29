package com.hundred.days.ds3;

public class SingleLinkedList {

	Node head;  // lastNode
	Node tail;  // tail - startNode

	public SingleLinkedList() {

	}

	public void add(Integer e) {
		Node node = new Node();
		node.setElement(e);
		if (head == null) {
			tail=node;
			
		} else {
			head.setNext(node);
		}
		head = node;

	}

	public void remove(Integer e) {
		Node prev=null;
		Node tempTail = tail;
		while(tempTail!=null) {
			if(tempTail.getElement()==e) {
				prev.setNext(tempTail.getNext());
			}
			prev=tempTail;
			tempTail =tempTail.getNext();
		}

	}

	
	/*
	 * to loop list
	 */

	public void iterator(Node node) {
		
		/*
		 * if you pass node it  loop next set of item from that node
		 * else it will loop start of linkedLis;
		 */
		if(node==null) {
			node=tail;
		}
		Node tempTail = node;
		while(tempTail!=null) {
			System.out.println(tempTail.getElement());
			tempTail=tempTail.getNext();
		
		}
		
	}
	
	public static void main(String[] args) {
		
		SingleLinkedList list = new SingleLinkedList();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(15);
		list.add(16);
		
		// Enable to reverse the list 
		//Node reverseNode = ReverseList.reverseWithoutExtraSpace(list.tail);
		
		Node middle = FindMiddleElementOfList.findMiddleElement(list.tail);
		
		System.out.println(middle.getElement());
		//list.iterator(null);
	
	}

}
