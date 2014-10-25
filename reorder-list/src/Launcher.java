
public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3 15 19
		// 3 19 15
		// 15 3 19
		// 15 19 3
		// 19 3 15
		// 19 15 3
		
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		ListNode node7 = new ListNode(7);
		ListNode node8 = new ListNode(8);
	
		node1.next = null;
		node2.next = null;
		node3.next = null;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = null;
		node8.next = null;

		Solution sol = new Solution();
		sol.reorderList(node1);
		
	}
	
	
}
