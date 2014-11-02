
public class Solution {

	public boolean checkSymmetry(TreeNode left, TreeNode right) {
		if (left == null && right == null) return true;
		if (left != null && right == null) return false;
		if (left == null && right != null) return false;
		if (left.val != right.val) return false;
		return checkSymmetry(left.left, right.right) && checkSymmetry(left.right, right.left);
	}
	
	public boolean isSymmetric(TreeNode root) {
		return checkSymmetry(root, root);
	}
}
