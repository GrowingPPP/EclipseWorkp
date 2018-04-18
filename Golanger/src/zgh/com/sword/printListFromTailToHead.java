package zgh.com.sword;

import java.util.ArrayList;

public class printListFromTailToHead {
/**
 * 输入一个链表，从尾到头打印链表每个节点的值。
 */
	    public ArrayList<Integer> printListFromTailToHeadmMain(ListNode listNode) {
		    ListNode r = null;
		    ListNode e = null;
		    ArrayList<Integer> arr=new ArrayList<Integer>();
		    
		    while(listNode.next != null){
			    r = listNode.next;
			    listNode.next = e;
			    e = listNode;
			    listNode = r;
		    }
		    
		    while(e.next!=null){
			    arr.add(e.val);
			    e =e.next;
		    }
		    
		    return arr;
		        
	    }
	
}
