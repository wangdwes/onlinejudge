import java.util.HashMap;
import java.util.Map;

public class LRUCache {
	
	private class ListNode {ListNode previous, next; Integer value, key; }
	private Map<Integer, ListNode> map = new HashMap<Integer, ListNode>();
	private ListNode head, end; 
	private int capacity_;
	
	public LRUCache(int capacity) { capacity_ = capacity; }
	
	public int get(int key) {
		if (map.containsKey(key)) {
			ListNode node = map.get(key);
			removeNode(node); setHead(node); return node.value;
		} else return -1; }
	
	public void removeNode(ListNode node) {
		ListNode previous = node.previous, next = node.next;
		if (previous != null) previous.next = next; else head = next;
		if (next != null) next.previous = previous; else end = previous; }
	
	public void setHead(ListNode node) {
		node.next = head; node.previous = null;
		if (head != null) head.previous = node; 
		head = node; if (end == null) end = node; }
	
	public void set(int key, int value) {
		if (map.containsKey(key)) {
			ListNode node = map.get(key); 
			node.value = value; removeNode(node); setHead(node);
		} else {
			ListNode node = new ListNode(); node.key = key; node.value = value;
			if (map.size() < capacity_) { setHead(node); map.put(key, node); }
			else { map.remove(end.key); end = end.previous; if (end != null) end.next = null;
				setHead(node); map.put(key, node);
			}
		}
	}
		
}