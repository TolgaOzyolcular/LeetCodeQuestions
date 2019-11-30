import java.util.*;
 
public class LongestPalindromicSubstring {
       public static void main (String[] args) {
              String input = "222020221";
             
              System.out.println(longestPalindrome(input));
       }
      
       public static String longestPalindrome(String input) {    	      		  
              String longestPalindrome = "";
              
              if(!input.matches("^[a-zA-Z0-9]*$") || !(input.length() > 1)){
	   			  return input;
	   		  }
             
              HashMap<Integer, Integer> singlePalindromeLengths = new HashMap<Integer, Integer>();
              HashMap<Integer, Integer> doublePalindromeLengths = new HashMap<Integer, Integer>();
             
              for(int i = 0; i < input.length(); i++)
            	  	singlePalindromeLengths.put(expand(input, i, i, true), i);  //Key is size of palindrome, Value is location in input string 
              
              for(int i = 0; i < input.length()-1; i++) 
            	  	doublePalindromeLengths.put(expand(input, i, i+1, false), i);
              
              System.out.println(singlePalindromeLengths);
              System.out.println(doublePalindromeLengths);
              
              if(Collections.max(singlePalindromeLengths.keySet()) > Collections.max(doublePalindromeLengths.keySet())) {
            	  	  
            	  	  int start = singlePalindromeLengths.get(Collections.max(singlePalindromeLengths.keySet())) - (Collections.max(singlePalindromeLengths.keySet())/2);
            	  	  int end = start + Collections.max(singlePalindromeLengths.keySet()) -1;

                  for(int i = start; i <= end; i++) {
                        longestPalindrome += input.charAt(i);
                  }
                  
          	  	System.out.println(longestPalindrome);
              }
          
              else {
            	  	  int start = doublePalindromeLengths.get(Collections.max(doublePalindromeLengths.keySet())) - (Collections.max(doublePalindromeLengths.keySet())/2) +1;
            	  	  int end = start + Collections.max(doublePalindromeLengths.keySet()) -1;
            	  	  
                  for(int i = start; i<= (int) end; i++) {
                        longestPalindrome += input.charAt(i);
                  }
              }

            	  
              return longestPalindrome;

       }
      
       public static int expand(String input, int start, int end, boolean singleChar) {
    	   	  if(singleChar) {
		      int palindromeLength = 1;
		     
		      start--;
		      end++;
		     
		      while(start >= 0 && end <= input.length()-1) {           
		             if(Character.compare(input.charAt(start), input.charAt(end)) == 0) {
		                   palindromeLength+=2;
		                   start--;
		                   end++;
		             }
		             else
		                   break;
		      }
		     
		      return palindromeLength;
    	   	  }
    	   	  
    	   	  else {   	
    	   		  int palindromeLength = 0;
  		      if(Character.compare(input.charAt(start), input.charAt(end)) == 0) { 
  		    	  	  palindromeLength = 2;
	  		    	  start--;
	  		      end++;
	  		      while(start >= 0 && end < input.length()) {   
  		             if(Character.compare(input.charAt(start), input.charAt(end)) == 0) {
  		                   palindromeLength+=2;
  		                   start--;
  		                   end++;
  		             }
  		             else
  		                   break;
	  		      }
	  		     
	  		      return palindromeLength;
  		      }
  		      
  		      else
  		    	  	return palindromeLength;
    	   	  }
       }
}