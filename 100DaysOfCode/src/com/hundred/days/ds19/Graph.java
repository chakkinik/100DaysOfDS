package com.hundred.days.ds19;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	public int vertices;
	List<Node> edges;
	
	Graph(int vertices){
		this.vertices=vertices;
		this.edges = new ArrayList<>();
	}
	
	public void addEges(Node node) {
		edges.add(node);
	}

}
