
public class Solution {
    public int[] plusOne(int[] digits) {
    	int carry = 0; 
    	for (int index = digits.length - 1; index >= 0; index--) {
    		digits[index] += (index == digits.length - 1 ? 1: carry);
    		carry = digits[index] / 10; digits[index] %= 10; }
    	
        if (carry > 0) {
        	int[] newDigits = new int[digits.length + 1];
        	newDigits[0] = carry; return newDigits; 
        } else return digits;
    }
}