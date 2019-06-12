package com.algoexpert.medium;

public class BSTConstruction {

	static class BST {
		public int value;
		public BST left;
		public BST right;

		public BST(int value) {
			this.value = value;
		}

		public BST insert(int value) {
			BST newBST = new BST(value);

			if (value > this.value) {
				if (this.right == null)
					this.right = newBST;
				else
					this.right.insert(value);

			} else {
				if (this.left == null)
					this.left = newBST;
				else
					this.left.insert(value);
			}

			return this;
		}

		public boolean contains(int value) {
			if(this.value ==value)
				return true;
			else if(value> this.value)
				this.right.contains(value);
			else
				this.left.contains(value);
			return false;
		}

		public BST remove(int value) {
			
			if(this.value==value)
			{
				//TODO 
					
			}
			return this;
		}

	}

}
