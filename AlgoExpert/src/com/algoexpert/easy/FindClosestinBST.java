package com.algoexpert.easy;

public class FindClosestinBST {
	static class BST {
		public int value;
		public BST left;
		public BST right;

		public BST(int value) {
			this.value = value;
		}
		
		public BST(int value,BST left,BST right) {
			this.value = value;
			this.left = left;
			this.right =right;
		}
	}
	
	/*
	 * Method populates Binary seach tree with static input
	 */
	private static BST populateBST()
	{
		BST tree =null;
		BST BST5 = new BST(5);
		BST BST13 = new BST(13);
		BST BST17 = new BST(17);
		BST BST15=new BST(15, BST13, BST17);
		BST BST10=new BST(10,BST5,BST15);
		tree=BST10;
		return tree;
	}

	public static int findClosestValueInBst(BST tree, int target) {
		int closest=-100;
		int difference=-100;
		BST current = tree;
		while(current!=null)
		{
			if(current==tree) // first time 
			{
				closest=tree.value;
				difference = Math.abs(target-current.value);
			}
			else
			{
				if(difference >  Math.abs(target-current.value))
				{
					difference = Math.abs(target-current.value);
					closest=current.value;
				}
			}
			if(current.value<target)
				current=current.right;
			else
				current=current.left;
		}
		return closest;
		
	}
	
	public static void main(String[] args) {
		int target =15;
		BST tree= populateBST();
		int closest=findClosestValueInBst(tree, target);
		System.out.println("Closest to the given target is: " + closest);
	}
}

