
public class Solution {
	private int totalSum = 0;
	
	public int sumNumbers(TreeNode root) {
		search(root, 0);
		return totalSum;
	}
	
	public void search(TreeNode node, int number) {
		if (node == null) return;
		
		int newNumber = number * 10 + node.val;
		if (node.left != null) search(node.left, newNumber);
		if (node.right != null) search(node.right, newNumber);
		if (node.left == null && node.right == null) totalSum += newNumber;
	}
}