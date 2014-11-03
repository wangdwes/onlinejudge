
public class Solution {
    public int firstMissingPositive(int[] A) {
    	for (int index = 0; index < A.length; index++)
    		while (A[index] > 0 && A[index] <= A.length && A[index] != A[A[index] - 1]) {
    			int exchange = A[A[index] - 1]; A[A[index] - 1] = A[index]; A[index] = exchange; }
    	for (int index = 0; index < A.length; index++)
    		if (A[index] != index + 1) return index + 1;
    	return A.length + 1;
    }
}