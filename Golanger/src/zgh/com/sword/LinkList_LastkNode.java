//package zgh.com.sword;
//
//public class LinkList_LastkNode {
//
//	/**
//	 * 输入一个链表，输出该链表中倒数第k个结点。
//	 * 
//	 * @param listnode
//	 * @return
//	 */
//	public ListNode Nizhi(ListNode listnode) {
//		ListNode pre = null;
//		ListNode next = null;
//		while (listnode != null) {
//			next = listnode.next;
//			listnode.next = pre;
//			pre = listnode;
//			listnode = next;
//		}
//		return pre;
//	}
//
//	public ListNode FindKthToTail(ListNode head,int k) {
//			 if (head == null) {
//		    			return head;
//		    		}
//		            if(k<=0) {
//		    			return null;
//		    }
//		         ListNode p=head;
//		    ListNode q=null;
//		            
//		         for(int i=1;i<k;i++)  {
//		            if(p.next!=null) {
//		    		p=p.next;}
//		            else {
//		    		return null;	
//		         }
//		         }
//	            q=head;
//	            while(p.next!=null){
//	                p=p.next;
//	                q=q.next;
//	            }
//		    return q;
//	    }
//
//	public static void main(String[] args) {
//
//	}
//
//}
