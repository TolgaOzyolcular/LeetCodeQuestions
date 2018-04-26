import java.util.HashSet;

/*
Given a string, find the length of the longest substring without repeating characters.
Examples:
Given "abcabcbb", the answer is "abc", which the length is 3.
Given "bbbbb", the answer is "b", with the length of 1.
Given "pwwkew", the answer is "wke" or "kew", with the length of 3.

 */
class LongestSubString {
	
	public static void main (String[] args) {
		String given = "bbbbb";
		
		LongestSubString t = new LongestSubString();
		
		System.out.println(t.lengthOfLongestSubstring(given));
	}
	
    public int lengthOfLongestSubstring (String s) {
		int chars = 0;
		HashSet<Character> set = new HashSet();
		
		for(int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
			for(int j = i+1; j < s.length(); j++) {
				if(set.contains(s.charAt(j))){					
					set.clear();
					break;
				}
				else {
					set.add(s.charAt(j));
					if(chars < set.size())
						chars = set.size();
				}
			}
		}
		
    		return chars;
    }
}