import java.util.List;

public class Solution {
	
	public ListNode mergeKLists(List<ListNode> lists) {
		if (lists.size() == 0) return null;
		if (lists.size() == 1) return lists.get(0);
		
		ListNode merged = lists.get(0);
		for (int index = 1; index < lists.size(); index++)
			merged = mergeTwoLists(merged, lists.get(index));
		return merged;
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) return l2; 
		if (l2 == null) return l1;
		
		ListNode merged; 
		// find where we should start...
		if (l1.val < l2.val) { merged = l1; l1 = l1.next; }
		else { merged = l2; l2 = l2.next; }
	
		ListNode orghead = merged;
		// and merge two sublists...
		while (l1 != null || l2 != null) {		
			if (l1 != null && l2 != null) {
				if (l1.val < l2.val) { merged.next = l1; l1 = l1.next; }
				else { merged.next = l2; l2 = l2.next; } }
			else if (l1 != null && l2 == null) { merged.next = l1; l1 = l1.next; }
			else if (l1 == null && l2 != null) { merged.next = l2; l2 = l2.next; }
			merged = merged.next; }
		
		return orghead;
	}		
	
}
