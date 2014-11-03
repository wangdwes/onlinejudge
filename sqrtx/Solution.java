
public class Solution {
    public int sqrt(int x) {
    	int result = 0;
    	int bit = 1 << 30;
    	
    	while (bit > x) bit >>= 2;
    	while (bit != 0) {
    		if (x >= result + bit) {
    			x -= result + bit;
    			result = (result >> 1) + bit; }
    		else result >>= 1;
    		bit >>= 2;
    	}
    	return result;
    }
}
