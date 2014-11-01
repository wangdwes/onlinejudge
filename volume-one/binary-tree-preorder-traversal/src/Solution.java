import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> traversal = new ArrayList<Integer>();
        if (root == null) return traversal;
        
        if (root.left != null) traversal.addAll(preorderTraversal(root.left));
        if (root.right != null) traversal.addAll(preorderTraversal(root.right));
        
        traversal.add(root.val);
        return traversal;
    }
}