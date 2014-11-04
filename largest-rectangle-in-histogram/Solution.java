import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int largestRectangleArea(int[] height) {
    	int area = 0, maxArea = 0;
    	Deque<Integer> stack = new ArrayDeque<Integer>();
    	
    	int index = 0; 
    	while (index < height.length || !stack.isEmpty()) {
    		if (stack.isEmpty() || (index < height.length && height[index] >= height[stack.peek()])) stack.push(index++);
    		else { area = height[stack.pop()] * (stack.isEmpty()? index: index - stack.peek() - 1); 
    			maxArea = Math.max(maxArea, area); }
    	}

    	return maxArea;
    }
}
