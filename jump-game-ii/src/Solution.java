
public class Solution {
	
    public int jump(int[] A) {
    	if (A.length <= 1) return 0; 
    	// if there are less than one element, then it is always reachable. 
    	
    	int minsteps[] = new int[A.length]; int reach = 0; minsteps[0] = 1;
    	// first element reachable with zero jumps, but here we give it
    	// a positive value to mark that it can be reached. needs to be deducted afterwards.   
    	   	
    	for (int index = 0; index < A.length - 1; index++) 
    		if (minsteps[index] > 0) // element reachable?
    			for (int mark = reach + 1; mark <= index + A[index]; mark++) {
    				reach = mark; if (mark >= A.length) break; 
    				else {	if (minsteps[mark] == 0) minsteps[mark] = minsteps[index] + 1;
    						if (minsteps[mark] >  0) minsteps[mark] = Math.min(minsteps[mark], minsteps[index] + 1); }
    			}

    	return minsteps[A.length - 1] - 1; // deduct the one. 
    }

}