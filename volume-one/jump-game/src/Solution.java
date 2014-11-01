
public class Solution {
    public boolean canJump(int[] A) {
    	if (A.length <= 1) return true; 
    	// if there are less than one element, then it is always reachable. 
    	
    	boolean reachable[] = new boolean[A.length]; 
    	reachable[0] = true; // first element always reachable since that's where you start off.
    	
    	for (int index = 0; index < A.length - 1; index++) 
    		if (reachable[index])
    			for (int mark = index + 1; mark <= index + A[index]; mark++)
    				if (mark >= A.length) break; else reachable[mark] = true;

    	return reachable[A.length - 1];       
    }
}