import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
	
	public Deque<TreeLinkNode> stack = new ArrayDeque<TreeLinkNode>();
	
    public void connect(TreeLinkNode root) {
    	postOrderTraversal(root);
    }
    
    public void postOrderTraversal(TreeLinkNode node) {
    	if (node == null) return;
    	if (!stack.isEmpty()) node.next = stack.pop();
    	postOrderTraversal(node.right);
    	postOrderTraversal(node.left);
    	stack.push(node);
    }
    
}
