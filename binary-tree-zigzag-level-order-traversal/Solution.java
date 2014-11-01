import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	public List<List<Integer>> traversal = new ArrayList<List<Integer>>();
	
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    	dfs(root, 0); return traversal;
    }
    
    public void dfs(TreeNode node, int depth) {
    	if (node == null) return;
    	
    	List<Integer> level = null;
    	if (depth > traversal.size() - 1) {
    		level = new ArrayList<Integer>();
    		traversal.add(level); }
    	else level = traversal.get(depth);
    	
    	if (depth % 2 == 0)	level.add(node.val);
    	else level.add(0, node.val);
    	
    	
    	dfs(node.left, depth + 1);
    	dfs(node.right, depth + 1);
    }
    
}