package zgh.com.sword;

public class TreeMirror {
	//¶þ²æÊ÷¾µÏñ
	    public void Mirror(TreeNode root) {
		    TreeNode tree = null;
		    if(root  == null){
			    return;
		    }
		    tree = root.left;
		    root.left = root.right;
		    root.right = tree;
		    if(root.left != null){
			    Mirror(root.left);
		    }
		    if(root.right != null){
			    Mirror(root.right);
		    }
		    
	    }
}
