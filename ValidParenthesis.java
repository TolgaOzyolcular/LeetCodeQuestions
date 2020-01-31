import java.util.*;

public class ValidParenthesis {
	public static boolean isValid(String s) {
        
        Stack<Character> chars = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                chars.push(s.charAt(i));

            else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'){
                char bracket;
                if(!chars.isEmpty())
                    bracket = chars.pop();
                else
                    return false;

                if((bracket == '(' && s.charAt(i) != ')') || (bracket == '{' && s.charAt(i) != '}') || (bracket == '[' && s.charAt(i) != ']'))
                    return false;

            }

        }
        
        if(chars.isEmpty())
            return true;
        else
            return false;
       
    }

}
