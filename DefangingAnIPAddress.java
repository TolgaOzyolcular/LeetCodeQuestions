import java.util.regex.*;

public class DefangingAnIPAddress {
	
	public static void main(String[] args) {
		String input = "1.1.1.1";
		
		System.out.println(defangIPaddr(input));
	}

	public static String defangIPaddr(String address) {
	    String output = address.replace(".","[.]");;	    
	   
		return output;
	}
}
