
public class Solution {
	
    public int searchInsert(int[] A, int target) {
    	int left = -1, right = A.length, middle = 0;
    	while (right - left > 1) { middle = (right + left) / 2;
    		if (target > A[middle]) left = middle; else right = middle; }
    	return right;
    }
}
