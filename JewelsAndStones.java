
public class JewelsAndStones {
	public static void main(String[] args) {
		String J = "aA";
		String S = "aAAbbbb";
		
		System.out.println(numJewelsInStones(J, S));
	}
	
	public static int numJewelsInStones(String J, String S) {
		int output = 0;
		
		for(int i = 0; i < J.length(); i++) {
			for(int k = 0; k < S.length(); k++) {
				if(J.charAt(i) == S.charAt(k)) {
					output++;
				}
			}
		}
		
		return output;
    }
}
