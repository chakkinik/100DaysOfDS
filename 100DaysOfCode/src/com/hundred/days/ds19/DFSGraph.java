package com.hundred.days.ds19;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class DFSGraph {
	
	public static  void dfs(Graph graph) {
		Stack<Node> stack = new Stack();
		
		for(Node node:graph.edges) {
			
			if(!node.visited) {
				stack.add(node);
				
				while(!stack.isEmpty()) {
					
					Node popNode = stack.pop();
					if(!popNode.visited) {
						System.out.println(popNode.data);
						popNode.visited=true;
					}
					for(Node n:popNode.edges) {
						if(!n.visited) {
							stack.add(n);
						}
					}
				}
			}
			
			
		}
		
		
		
	}
	
	
	public static  void bfs(Graph graph) {
		Queue<Node> stack = new LinkedBlockingQueue<>();
		
		for(Node node:graph.edges) {
			
			if(!node.visited) {
				stack.add(node);
				
				while(!stack.isEmpty()) {
					
					Node popNode = stack.remove();
					if(!popNode.visited) {
						System.out.println(popNode.data);
						popNode.visited=true;
					}
					for(Node n:popNode.edges) {
						if(!n.visited) {
							stack.add(n);
						}
					}
				}
			}
			
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		
		first.addEdges(third);
		third.addEdges(first);
		third.addEdges(fourth);
		fourth.addEdges(first);
		
		 
		Graph graph = new Graph(4);
		graph.addEges(first);
		graph.addEges(second);
		graph.addEges(third);
		graph.addEges(fourth);
		dfs(graph);
		
		System.out.println("===");
		Graph graph1 = new Graph(4);
		Node first1 = new Node(1);
		Node second1 = new Node(2);
		Node third1 = new Node(3);
		Node fourth1 = new Node(4);
		graph1.addEges(first1);
		graph1.addEges(second1);
		graph1.addEges(third1);
		graph1.addEges(fourth1);
		bfs(graph1);
		
	}

}
