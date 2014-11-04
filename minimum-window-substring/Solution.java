
public class Solution {
    public String minWindow(String S, String T) {
    	
    	// http://leetcode.com/2010/11/finding-minimum-window-in-s-which.html
    	// cheating a little bit? since we don't know about the character set.
    	int[] needToFind = new int[256], hasFound = new int[256];
    	int count = 0, left = 0, right = S.length(); 
    	
    	for (int index = 0; index < T.length(); index++)
    		needToFind[T.charAt(index)]++;
    	
    	for (int begin = 0, end = 0; end < S.length(); end++) {
    		if (needToFind[S.charAt(end)] == 0) continue;
    		if (++hasFound[S.charAt(end)] <= needToFind[S.charAt(end)]) count++;
    		if (count == T.length()) {
    			while (needToFind[S.charAt(begin)] == 0 || // don't need to find it at all ...
    				(hasFound[S.charAt(begin)] > needToFind[S.charAt(begin)])) { // or we've found too many...
    				if (hasFound[S.charAt(begin)] > needToFind[S.charAt(begin)])
    					hasFound[S.charAt(begin)]--;
    				begin++; } // compress the window as much as we can!
    			if (end - begin < right - left) { left = begin; right = end; }
    		}
    	}
    	
    	if (right - left >= S.length()) return new String("");
    	else return S.substring(left, right + 1);
    }
}
