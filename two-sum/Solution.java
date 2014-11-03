import java.util.HashMap;
import java.util.Map;

public class Solution {
	
    public int[] twoSum(int[] numbers, int target) {
    	Map<Integer, Integer> remainders = new HashMap<Integer, Integer>();
    	
    	for (int index = 0; index < numbers.length; index++) {
    		if (remainders.containsKey(numbers[index])) {
    			int[] indices = new int[2];
    			indices[0] = remainders.get(numbers[index]) + 1;
    			indices[1] = index + 1; 
    			return indices;
    		}
    		remainders.put(target - numbers[index], index);
    	}
    	
    	return null;
    }
	
}
