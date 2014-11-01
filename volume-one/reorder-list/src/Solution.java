
public class Solution {
	public void reorderList(ListNode head) {
		if (head == null) return;
		
		boolean isReordering = false;
		ListNode scoutNode = head, workerNode = head;
		ListNode previousNode = null, nextNode = null;
		
		while (workerNode != null) {
			if (isReordering) {
				nextNode = workerNode.next; workerNode.next = previousNode;
				previousNode = workerNode; workerNode = nextNode;
			} else {
				if (scoutNode != null && scoutNode.next != null) {
					scoutNode = scoutNode.next.next; workerNode = workerNode.next; } 
				else { nextNode = workerNode.next; workerNode.next = null; 
					workerNode = nextNode; isReordering = true; } } }
		
		ListNode mergedNode = head, mainNode = head.next, mergingNode = previousNode;
		while (mergingNode != null) {
			mergedNode.next = mergingNode; mergingNode = mergingNode.next;
			mergedNode = mergedNode.next; mergedNode.next = mainNode; mainNode = mainNode.next;
			mergedNode = mergedNode.next; }

	}	
}
