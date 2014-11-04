import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public String simplifyPath(String path) {
    	Deque<String> stack = new ArrayDeque<String>();
    	
    	for (int index = 0, slash; index >= 0 && index < path.length(); index = slash) {
    		while (index < path.length() && path.charAt(index) == '/') index++;
    		slash = path.indexOf('/', index); if (slash == -1) slash = path.length();
    		String token = path.substring(index, slash); // the token!
    		if (token.equals("..")) { if (!stack.isEmpty()) stack.pop(); }
    		else if (!token.equals(".") && token.length() > 0) stack.push(token);
    	}
    	
    	String simplifiedPath = new String();
    	if (stack.isEmpty()) simplifiedPath = "/";
    	while (!stack.isEmpty())
    		simplifiedPath = "/" + stack.pop() + simplifiedPath;
    	
    	return simplifiedPath;
    }
}
