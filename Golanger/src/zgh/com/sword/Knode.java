package zgh.com.sword;

import java.util.Stack;

public class Knode {
	/*
	 * 
	 * 题目描述 给定一颗二叉搜索树，请找出其中的第k大的结点。 例如， 5 / \ 3 7 /\ /\ 2 4 6 8
	 * 中，按结点数值大小顺序第三个结点的值为4。
	 */
	class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;
		}
	}

	int index = 0;

	// 思路：二叉搜索树按照中序遍历的顺序打印出来正好就是排序好的顺序。
	// 所以，按照中序遍历顺序找到第k个结点就是结果。
	TreeNode KthNode(TreeNode pRoot, int k) {
		if (pRoot != null) {
			TreeNode node = KthNode(pRoot.left, k);
			if (node != null) {
				return node;
			}
			index++;

			if (index == k) {
				return pRoot;
			}

			node = KthNode(pRoot.right, k);

			if (node != null) {
				return node;
			}
		}
		return null;
	}

	// 非递归中序遍历
	TreeNode AKthNode(TreeNode root, int k) {
		if (root == null || k == 0)
			return null;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		int count = 0;
		TreeNode node = root;
		do {
			if (node != null) {
				stack.push(node);
				node = node.left;
			} else {
				node = stack.pop();
				count++;
				if (count == k)
					return node;
				node = node.right;
			}
		} while (node != null || !stack.isEmpty());
		return null;
	}
}