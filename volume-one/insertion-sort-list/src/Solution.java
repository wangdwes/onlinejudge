
public class Solution {
	
    public ListNode insertionSortList(ListNode head) {
    	ListNode curnode = head;
    	while (curnode != null && curnode.next != null) {
    		ListNode nextnode = curnode.next;
    		if (curnode.next.val < head.val) {
    			ListNode tpnode = curnode.next.next;
    			curnode.next.next = head; head = curnode.next; curnode.next = tpnode; }
    		else if (curnode.next.val < curnode.val) {
    			ListNode srhnode = head;
    			while (srhnode != curnode) {
    				if (srhnode.val <= curnode.next.val && srhnode.next.val > curnode.next.val) {
    					ListNode tpnode = curnode.next.next;
    					curnode.next.next = srhnode.next; srhnode.next = curnode.next;
    					curnode.next = tpnode; break; }
    				srhnode = srhnode.next; } }   		
    		curnode = nextnode; }
    	return head;
    }
    
}	