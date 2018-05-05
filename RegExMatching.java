class RegExMatching {
	
	public static void main(String[] args) {
		String s = "mississippi";
		String p = "mis*is*p*.";
		
		RegExMatching t = new RegExMatching();
		System.out.println(t.isMatch(s, p));
	}
	
    public boolean isMatch(String s, String p) {   	
    		p.replaceAll(" ", "");   		
    		
    		if(s.matches(p)) {
    			return true;
    		}
    		else {
    			return false;
    		}
    }
    
}