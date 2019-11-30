import java.util.Arrays;
import java.util.regex.*;
 
public class StringtoIntegerAtoi {
    public static void main (String[] args) {
       String input = "      -11919730356x";
                   
        System.out.println(myAtoi(input));
    }
   
    public static int myAtoi(String input) {
        int output = 0;  
        
        Pattern pattern = Pattern.compile("^(\\s*)(-[0-9]+|^-[0-9]|[0-9]|\\+[0-9])([0-9]*)");
        Matcher matcher = pattern.matcher(input);
        
        if(!input.equals("")) {
        	
             
            if(matcher.find()) {
            		input = matcher.group().replaceAll("\\s","");  
                           
                try {
                    output = Integer.parseInt(input);
                }
               
                catch(Exception NumberFormatException) {
                    if(input.charAt(0) == '-')
                        output = Integer.MIN_VALUE;
                    else
                        output = Integer.MAX_VALUE;
                    }
                                                   
                    return output;
                }
            }
 
            return output;
    }
}