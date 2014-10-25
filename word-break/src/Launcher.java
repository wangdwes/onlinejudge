import java.util.HashSet;
import java.util.Set;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abc";
		Set<String> dict = new HashSet<String>();
		dict.add("abc");
		dict.add("de");
		dict.add("ff");
		
		Solution sol = new Solution();
		
		System.out.println(sol.wordBreak(s, dict));		
	}

}
