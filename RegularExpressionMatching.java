import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionMatching {
	public static void main (String[] args) {
		String s = "abcd";
		String p = "a*b.*d";
		
		System.out.println(isMatch(s,p));
	}
	
	public static boolean isMatch(String s, String p) {
		boolean isMatch = false;		
		String toMatch = "^" + p + "$";
		
		System.out.println(toMatch);
		
		if(p.equals(s)) {
			isMatch = true;
			return isMatch;
		}
		
		Pattern pattern = Pattern.compile(toMatch);
		Matcher matcher = pattern.matcher(s);
		
		if(matcher.find()) {
			isMatch = true;
		}	
		
		return isMatch;
	}
}
