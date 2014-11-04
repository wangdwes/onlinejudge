
public class Solution {
    public int maxSubArray(int[] A) {
    	if (A == null || A.length == 0) return 0;
    	int maximum = A[0], accumulative = A[0]; 
        for (int index = 1; index < A.length; index++) {
        	if (accumulative < 0) accumulative = A[index]; else accumulative += A[index];
        	maximum = Math.max(accumulative, maximum); }
        return maximum;
    }
}