
// the online-judge verifies the result in an awkward manner, 
// such that modifying the next pointer leads to infinite loop.

// c.f.: http://umairsaeed.com/2011/06/23/finding-the-start-of-a-loop-in-a-circular-linked-list/

public class Solution {
	public ListNode detectCycle(ListNode head) {
		if (head == null) return null;
		
		ListNode slowNode = head;
		ListNode fastNode = head;
		
		while (slowNode != null && fastNode != null) {
			slowNode = slowNode.next;
			if (fastNode.next == null) return null;
			
			fastNode = fastNode.next.next;
			if (slowNode == fastNode) {
				slowNode = head;
				while (slowNode != fastNode) {
					slowNode = slowNode.next;
					fastNode = fastNode.next; }
				
				return slowNode;
			}
		}

		return null;
	}
}
