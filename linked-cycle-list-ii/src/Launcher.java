
public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode node1 = new ListNode(3);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(0);
		ListNode node4 = new ListNode(-4);
		
		node1.next = node1;
		node2.next = node3;
		node3.next = node4;
		node4.next = null;

		Solution sol = new Solution();
		System.out.println(sol.detectCycle(node1).val);
						
		
	}

}
