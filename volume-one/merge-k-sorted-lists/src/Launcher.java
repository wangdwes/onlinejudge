import java.util.ArrayList;
import java.util.List;


public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ListNode node1 = new ListNode(3);
		ListNode node2 = new ListNode(15);
		ListNode node3 = new ListNode(17);
		ListNode node4 = new ListNode(22);
		ListNode node5 = new ListNode(6);
		ListNode node6 = new ListNode(13);
		ListNode node7 = new ListNode(16);
		
		node1.next = null;
		node2.next = node3;
		node3.next = node4;
		node4.next = null;
		node5.next = node6;
		node6.next = node7;
		node7.next = null;
		
		List<ListNode> lists = new ArrayList<ListNode>();
		lists.add(node1);
		lists.add(node2);

		Solution sol = new Solution();
		ListNode head = sol.mergeKLists(lists);
				
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
		
	
	}

}