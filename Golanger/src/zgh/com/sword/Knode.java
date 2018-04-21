package zgh.com.sword;

import java.util.Stack;

public class Knode {
	/*
	 * 
	 * ��Ŀ���� ����һ�Ŷ��������������ҳ����еĵ�k��Ľ�㡣 ���磬 5 / \ 3 7 /\ /\ 2 4 6 8
	 * �У��������ֵ��С˳�����������ֵΪ4��
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

	// ˼·�������������������������˳���ӡ�������þ�������õ�˳��
	// ���ԣ������������˳���ҵ���k�������ǽ����
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

	// �ǵݹ��������
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