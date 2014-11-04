import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int trap(int[] A) {
    	Deque<Integer> stack = new ArrayDeque<Integer>();
    	int index = 0, amount = 0;
    	while (index < A.length) {
    		if (stack.isEmpty() || A[index] < A[stack.peek()]) stack.push(index++);
    		else { int topIndex = stack.pop(); 
    			if (!stack.isEmpty())
    				amount += (Math.min(A[stack.peek()], A[index]) - A[topIndex]) * (index - 1 - stack.peek()); } }
    	return amount;
    }
}