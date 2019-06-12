package com.algoexpert.easy;

import java.util.ArrayList;

public class DepthFirstSearch {

	
	static class Node
	{
		private String name;
		private ArrayList<Node> children = new ArrayList<Node>();
		
		public Node(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public ArrayList<Node> getChildren() {
			return children;
		}

		public void setChildren(ArrayList<Node> children) {
			this.children = children;
		}
		
		public Node addChild(String name) {
		      Node child = new Node(name);
		      children.add(child);
		      return this;
		    }
		
		public Node addChildren(Node... children) {
		      for(Node node:children)
		      this.children.add(node);
		      return this;
		    }
		/*
		 * Time Complexity = O(V+E)
		 * Space Complexity = O(V)
		 */
		 public ArrayList<String> depthFirstSearch(ArrayList<String> array) {
			 array.add(this.name);
			 for(Node node:this.getChildren())
				 node.depthFirstSearch(array);
			 return array;
		    }

	}
	
	private static Node populateTree()
	{
		Node root=new Node("A");
		Node e=new Node("E");
		Node f=new Node("F");
		f.addChild("I");
		f.addChild("J");
		Node g=new Node("G");
		g.addChild("K");
		Node h=new Node("H");
		Node b=new Node("B");
		Node c=new Node("C");
		Node d=new Node("D");
		b.addChildren(e,f);
		d.addChildren(g,h);
		root.addChildren(b,c,d);
		return root;
		
	}
	/*
	 * Depth first search 
	 */
	private static void depthFirstSearch(Node root)
	{
		System.out.print(root.getName() +" ");
		for(Node node:root.getChildren())
		{
			depthFirstSearch(node);
		}
	}
	public static void main(String[] args) {
		Node root=populateTree();
		depthFirstSearch(root);
		ArrayList<String> dfsResult=new ArrayList<String>();
		dfsResult =root.depthFirstSearch(dfsResult);
		System.out.println("dfs result: "+ dfsResult);
	}
}
