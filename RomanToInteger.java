import java.util.HashMap;
 
public class RomanToInteger {
       public static void main (String[] args) {
              String input = "LVIII";
             
              System.out.println(romanToInt(input));
       }
      
       public static int romanToInt(String input) {
              int number = 0;
             
              HashMap<String, Integer> values = new HashMap<String, Integer>();
             
              values.put("I", 1);
              values.put("IV", 4);
              values.put("V", 5);
              values.put("IX", 9);
              values.put("X", 10);
              values.put("XL", 40);
              values.put("L", 50);
              values.put("XC", 90);
              values.put("C", 100);
              values.put("CD", 400);
              values.put("D", 500);
              values.put("CM", 900);
              values.put("M", 1000);
             
              for(int i = 0; i < input.length(); i++) {
                     try {
                           char firstChar = input.charAt(i);
                           String numString = "";
                                               
                           if(i+1 < input.length()) {
                                  char secondChar = input.charAt(i+1);                  
                                  numString = numString + firstChar + secondChar;
                                 
                                  if(values.containsKey(numString)) {
                                         number += values.get(numString);
                                         i++;
                                  }     
                                 
                                  else {
                                         numString = "" + firstChar;
                                         number += values.get(numString);
                                  }
                           }
                          
                           else {
                                  numString = "" + firstChar;
                                  number += values.get(numString);
                           }     
                     }
                    
                     catch(Exception e) {
                           System.out.println("Wrong Entry");
                           System.exit(0);
                     }
              }
             
        return number;
    }
}