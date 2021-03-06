public class LongestCommonPrefix {
       public static void main(String[] args) {
              String[] input = {"c","acc","ccc"};
             
              System.out.println(longestCommonPrefix(input));
       }
      
       public static String longestCommonPrefix(String[] input) {
    	   
    	   	if(input.length == 0) {
    	   		return "";
    	   	}
    	   	
        StringBuilder commonPrefix = new StringBuilder();
        int stringLength = input[0].length();
        boolean isEqual = false;
       
        for(int i = 0; i<input.length; i++) {
              if(input[i].length() < stringLength)
                     stringLength = input[i].length();
        }
       
        for(int i = 0; i < stringLength; i++) {
              char letter = input[0].charAt(i);
              
              for(int j = 0; j < input.length; j++) {
                     if(letter == input[j].charAt(i))
                           isEqual = true;
                     else {
                           isEqual = false;
                           return commonPrefix.toString();
                     }
              }
             
              if(isEqual)
                   commonPrefix.append(letter);
              
              System.out.println(commonPrefix.toString());
        }
       
        return commonPrefix.toString();
    }
}