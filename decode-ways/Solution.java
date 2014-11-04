
public class Solution {
    public int numDecodings(String s) {
    	if (s.length() == 0) return 0;
    	int[] numberOfWays = new int[s.length() + 1]; numberOfWays[0] = 1;
    	for (int index = 1; index <= s.length(); index++) {
    		for (int j = 1; j <= 2; j++) { if (j > index) continue;
    			int value = Integer.valueOf(s.substring(index - j, index));
    			if (1 <= value && value <= 26 && value >= Math.pow(10, j - 1))
    				numberOfWays[index] += numberOfWays[index - j]; } }
    	return numberOfWays[s.length()];
    }
}
