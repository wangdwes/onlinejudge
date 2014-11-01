
public class Solution {
	public boolean hasCycle(ListNode head) {
		if (head == null) return false;
		
		ListNode nextNode = null;
		while (head != null) {
			nextNode = head.next; if (nextNode == head) return true;
			head.next = head; head = nextNode; }
		
		return false;
	}
}
