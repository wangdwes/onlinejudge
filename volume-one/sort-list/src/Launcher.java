
public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3 15 19
		// 3 19 15
		// 15 3 19
		// 15 19 3
		// 19 3 15
		// 19 15 3
		
		ListNode node1 = new ListNode(19);
		ListNode node2 = new ListNode(15);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(36);
		ListNode node5 = new ListNode(12);
		ListNode node6 = new ListNode(4);
		ListNode node7 = new ListNode(22);
		
		node1.next = null;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = null;

		Solution sol = new Solution();
		ListNode head = sol.sortList(node1);
				
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
		
	
	}

}