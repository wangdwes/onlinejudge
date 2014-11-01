
public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		
		node1.left = null;
		node1.right = node3;
		
		Solution sol = new Solution();
		
		System.out.println(sol.sumNumbers(node1));
		
		
	}

}
