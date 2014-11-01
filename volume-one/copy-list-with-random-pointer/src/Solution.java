
public class Solution {

	public RandomListNode copyRandomList(RandomListNode head) {
		if (head == null) return null; 
		
		RandomListNode pointer = head; 
		while (pointer != null) { // duplicate the list entirely first.
			RandomListNode duplicate = new RandomListNode(pointer.label);
			duplicate.next = pointer.next; pointer.next = duplicate; pointer = duplicate.next; }
		
		// make connections by processing random pointers. 
		for (pointer = head; pointer != null; pointer = pointer.next.next)
			if (pointer.random != null) pointer.next.random = pointer.random.next;		

		// spill the duplicated nodes from the original. 
		RandomListNode copiedListHead = head.next;
		for (pointer = head; pointer != null; pointer = pointer.next) {
			RandomListNode nextNode = pointer.next.next;
			if (nextNode != null) pointer.next.next = nextNode.next;
			pointer.next = nextNode; }
		
		return copiedListHead;
	}
	
}
