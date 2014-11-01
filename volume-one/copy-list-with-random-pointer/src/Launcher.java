
public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RandomListNode node1 = new RandomListNode(6);
		RandomListNode node2 = new RandomListNode(3);
		RandomListNode node3 = new RandomListNode(5);
		RandomListNode node4 = new RandomListNode(9);
		
		node1.next = null;
		node2.next = node3;
		node3.next = node4;
		
		node1.random = node1;
		node4.random = node1;
		
		Solution sol = new Solution();
		RandomListNode cn = sol.copyRandomList(node1);
		
		System.out.println(cn.random.random.label);
	}

}
