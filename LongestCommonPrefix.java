class LongestCommonPrefix {
	
	public static void main(String[] args) {
		String[] input = {"dog","racecar","car"};
		
		LongestCommonPrefix t = new LongestCommonPrefix();
		System.out.println(t.longestCommonPrefix(input));
	}
    public String longestCommonPrefix(String[] s) {
    		int length = s[0].length();
        char compare = ' ';
        String output = "";
        
    		for(int i = 1; i < s.length; i++) {
    			if(length > s[i].length())
    				length = s[i].length();
    		}
    		
    		for(int i = 0; i<length; i++) {
    			compare = s[0].charAt(i);    			
    			//System.out.println(output);
    			for(int j = 0; j<s.length; j++) {
    				if(compare != s[j].charAt(i)) {
    					return output;
    				}
    			}
    			output += compare;
    		}
    		
    		return output;
    }
}