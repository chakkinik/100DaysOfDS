package com.hundred.days.ds4;

import java.util.HashSet;
import java.util.Set;

import com.hundred.days.ds3.Node;

public class FindIntersectionOfTwoList {

	
	static Set<Node> set = new HashSet<>();
	
	private static void findIntersectionNode(Node head1, Node head2) {

		Node temp1=head1;
		
		Node temp2=head2;
		
		while(temp1!=null) {
			set.add(temp1);
			temp1=temp1.next;
		}
		
		while(temp2!=null) {
		   if(set.contains(temp2)) {
			   System.out.println("found the inters" + temp2.element);
			   break;
		   }
		   temp2=temp2.next;
		}
	
		
		
	}

	public static void main(String[] args) {
		Node head1 = new Node(5);
		head1.next = new Node(6);
		Node node = new Node(8);
		head1.next.next = node;
		Node next9 = new Node(9);
		head1.next.next.next = next9;

		Node head2 = new Node(7);

		head2.next = node;
		head2.next.next = next9;

		findIntersectionNode(head1, head2);
	}

}
