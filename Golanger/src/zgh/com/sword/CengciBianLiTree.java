package zgh.com.sword;

import java.util.ArrayList;

public class CengciBianLiTree {
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        if(root == null){
	            return list;
	        }
	        ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
	        
	        queue.add(root);
	        
	        while(queue.size() != 0){
	            TreeNode tmp = queue.remove(0);
	            if(tmp.left != null){
	        	    queue.add(tmp.left);
	            }
	            if(tmp.right != null){
	        	    queue.add(tmp.right);
	            }
	            list.add(tmp.val);
	        }
	        return list;
	    }
}
