
public class Solution {

	// 1 2 3 4 5 6 7 8 9
	// 1 2 3 5 4 6 7 8 9: 5,4;
	// 1 2 6 4 5 3 7 8 9: 6,4;5,3;

	public TreeNode first;
	public TreeNode second;
	public TreeNode previous;
	
	public void recover(TreeNode node) {
		if (node == null) return;
		recover(node.left);
		if (previous != null && previous.val > node.val) {
			if (second == null) first = previous; 
			second = node; } previous = node;
		recover(node.right);
	}
	
    public void recoverTree(TreeNode root) {
        recover(root);
        if (first != null && second != null) {
        	int exchange = first.val;
        	first.val = second.val; second.val = exchange; 
        }
    }
    
}
