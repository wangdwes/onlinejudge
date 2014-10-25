
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
		
		node1.next = node2;
		node2.next = node3;
		node3.next = null;

		Solution sol = new Solution();
		ListNode head = sol.insertionSortList(node1);
				
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
		
	
	}

}