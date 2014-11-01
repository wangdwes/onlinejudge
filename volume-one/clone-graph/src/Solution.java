import java.util.HashMap;
import java.util.LinkedList;

public class Solution {
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) { if (node == null) return null;
		HashMap<Integer, UndirectedGraphNode> cloneMap = new HashMap<Integer, UndirectedGraphNode>();
		LinkedList<UndirectedGraphNode> queuedNodes = new LinkedList<UndirectedGraphNode>(); queuedNodes.offer(node);
		
		UndirectedGraphNode currentNode = null;
		while (!queuedNodes.isEmpty()) { // nodes queued for processing?
			currentNode = queuedNodes.poll(); // poll out one of the nodes.
			if (!cloneMap.containsKey(currentNode.label)) // node not cloned yet?
				cloneMap.put(currentNode.label, new UndirectedGraphNode(currentNode.label)); // clone and put it in the hash-map. 
			if (node.neighbors != null) { // if this node has neighbors, 
				for (UndirectedGraphNode neighbor: currentNode.neighbors) { // process each neighbor. create if necessary. 
					if (!cloneMap.containsKey(neighbor.label)) { 
						queuedNodes.offer(neighbor); // the newly created node has its own neighbors... to be processed later. 
						cloneMap.put(neighbor.label, new UndirectedGraphNode(neighbor.label)); } 
					cloneMap.get(currentNode.label).neighbors.add(cloneMap.get(neighbor.label)); } } }
		
		return cloneMap.get(node.label);
	}
}
