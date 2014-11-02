
public class Solution {

	// 1 2 3 4 5 6 7 8 9
	// 1 2 3 5 4 6 7 8 9: 5,4;
	// 1 2 6 4 5 3 7 8 9: 6,4;5,3;

	public TreeNode previous;
	
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        if (!isValidBST(root.left)) return false;
        if (previous != null && root.val <= previous.val) return false;
        previous = root;
        if (!isValidBST(root.right)) return false;
        return true; 
    }
    
}
