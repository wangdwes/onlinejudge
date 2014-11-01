
public class Solution {
	public int evalRPN(String[] tokens) {
	
		if (tokens.length < 3)
			return Integer.parseInt(tokens[0]);
		
		for (int index = 2, eval = 0; index < tokens.length; index++) {
			if (!tokens[index].matches("[-+*/]")) continue;
			// making sure that we're dealing with arithmetic operators. 
			
			int operands[] = new int[2], operandcount = 0; 
			for (int finder = index - 1; finder >= 0; finder--)
				if (tokens[finder] != "" && operandcount < 2)
					try { operands[operandcount++] = Integer.parseInt(tokens[finder]); tokens[finder] = ""; }
					catch (NumberFormatException exception) { operandcount--; }

			switch (tokens[index]) {
			case "+": eval = operands[1] + operands[0]; break;
			case "-": eval = operands[1] - operands[0]; break;
			case "*": eval = operands[1] * operands[0]; break;
			case "/": eval = operands[1] / operands[0]; break;
			default: continue; }
					
			tokens[index] = String.valueOf(eval);
		}
		
		return Integer.parseInt(tokens[tokens.length - 1]);
	}
}
