import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	public List<List<Integer>> traversal = new ArrayList<List<Integer>>();
	
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
    	dfs(root, 0); 
    	
    	List<List<Integer>> inverse = new ArrayList<List<Integer>>();
    	for (int index = traversal.size() - 1; index >= 0; index--)
    		inverse.add(traversal.get(index));
    	
    	return inverse;
    }
    
    public void dfs(TreeNode node, int depth) {
    	if (node == null) return;
    	
    	List<Integer> level = null;
    	if (depth > traversal.size() - 1) {
    		level = new ArrayList<Integer>();
    		traversal.add(level); }
    	else level = traversal.get(depth);
    	
    	level.add(node.val);
    	dfs(node.left, depth + 1);
    	dfs(node.right, depth + 1);
    }
    
}
