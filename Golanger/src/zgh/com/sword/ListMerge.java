package zgh.com.sword;

public class ListMerge {
	//题目描述
	//输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}
	public ListNode Merge(ListNode list1, ListNode list2) {
		if(list1 == null){
			return list2;
		}
		if(list2 == null){
			return list1;
		}
		if(list1.val <= list2.val){
			list1.next = Merge(list1.next, list2);
			return list1;
		}else{
			list2.next = Merge(list1, list2.next);
			return list2;
		}
	}
	public ListNode MergeFeiDiGui(ListNode list1, ListNode list2) {
		if(list1 == null){
			return list2;
		}
		if(list2 == null){
			return list1;
		}
		ListNode node = null;
		ListNode l1 = null;
		
		while(list1 != null && list2 != null){
			if(list1.val <= list2.val){
				if(node == null){
					node = l1 = list1;
				}else{
					l1.next = list1;
					l1= l1.next;
				}
				list1 = list1.next;
			}else{
				
				if(node == null){
					node = l1 = list2;
				}else{
					l1.next = list2;
					l1= l1.next;
				}
				list2 = list2.next;
			}
			
		}
		if(list1 == null)
			l1.next = list2;
		else
			l1.next = list1;
		
		return node;

	}
}
