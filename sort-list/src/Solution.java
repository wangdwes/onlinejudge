
public class Solution {
	
	public ListNode sortList(ListNode head) {
		return mergeSort(head);	
	}
	
	public ListNode mergeSort(ListNode head) {
		if (head == null || head.next == null) return head;
			
		// find the node residing in the middle of the singly-linked list. 
		ListNode middle = head, tail = head;
		while (tail.next != null && tail.next.next != null) {
			middle = middle.next;
			tail = tail.next.next; }
		
		// cut the linked-list to two halves and merge-sort them respectively.		
		ListNode righthead = middle.next, lefthead = head, mergedhead = null;
		middle.next = null; lefthead = mergeSort(lefthead); righthead = mergeSort(righthead);
 	
		// find where we should start...
		if (lefthead.val < righthead.val) { mergedhead = lefthead; lefthead = lefthead.next; }
		else { mergedhead = righthead; righthead = righthead.next; }
	
		ListNode orghead = mergedhead;
		// and merge two sublists...
		while (lefthead != null || righthead != null) {		
			if (lefthead != null && righthead != null) {
				if (lefthead.val < righthead.val) { mergedhead.next = lefthead; lefthead = lefthead.next; }
				else { mergedhead.next = righthead; righthead = righthead.next; } }
			else if (lefthead != null && righthead == null) { mergedhead.next = lefthead; lefthead = lefthead.next; }
			else if (lefthead == null && righthead != null) { mergedhead.next = righthead; righthead = righthead.next; }
			mergedhead = mergedhead.next; }
		
		return orghead;
		
	}	// 19 15 3 36 12 4 22
}	