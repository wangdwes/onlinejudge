import java.util.HashSet;
import java.util.Set;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aaaaaaaaaa";
		Set<String> dict = new HashSet<String>();
		dict.add("a");
		dict.add("aa");
		dict.add("aaa");
		dict.add("aaaa");
		
		Solution sol = new Solution();
		System.out.println(sol.wordBreak(s, dict).toString());
		
	}

}
