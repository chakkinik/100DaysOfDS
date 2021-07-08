package com.hundred.days.ds19;

import java.util.List;

public class Node {
	public int data;
	public List<Node> edges;
	public boolean visited;
	
	public Node(int data) {
		this.data=data;
		this.visited=false;
	}

}
