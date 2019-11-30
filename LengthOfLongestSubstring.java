import java.util.*;
 
public class LongestSubstringWithoutRepeatingCharacters {
       public static void main (String[] args) {
              String input = "bbbbb";
             
              System.out.println(lengthOfLongestSubstring(input));
       }
      
       public static int lengthOfLongestSubstring(String input) {
              int count = 0;
             
              Stack<Character> letters = new Stack<Character>();
             
              for(int i = 0; i < input.length(); i++) {
                     if(letters.search(input.charAt(i)) == -1) {
                           letters.push(input.charAt(i));
                     }
                    
                     else {
                           if(letters.size() > count)
                                  count = letters.size();
                          
                           letters.clear();
                           i--;
                     }
              }
             
              return count;
       }
      
}