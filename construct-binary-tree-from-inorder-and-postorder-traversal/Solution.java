
public class Solution {
	
	// http://www.programcreek.com/2013/01/construct-binary-tree-from-inorder-and-postorder-traversal/
	// https://oj.leetcode.com/discuss/10961/my-recursive-java-code-with-o-n-time-and-o-n-space

	public int postorderIndex = 0;
	public int inorderIndex = 0;
	public int[] postorder_;
	public int[] inorder_;
	
	public TreeNode construct(TreeNode bound) {
		if (postorderIndex < 0) return null;
		TreeNode node = new TreeNode(postorder_[postorderIndex--]);
		if (inorder_[inorderIndex] != node.val)
			node.right = construct(node);
		inorderIndex--; 
		if ((bound == null) || (inorder_[inorderIndex] != bound.val))
			node.left = construct(bound);
		return node;
	}
	
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		inorderIndex = inorder.length - 1; inorder_ = inorder;
		postorderIndex = postorder.length - 1; postorder_ = postorder;
		return construct(null);
	}
	
}
