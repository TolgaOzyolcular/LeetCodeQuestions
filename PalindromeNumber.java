
public class PalindromeNumber {
      
       public static void main (String[] args) {
              int input = 121;
             
              System.out.println(isPalindrome(input));
       }
 
    public static boolean isPalindrome(int input) {   
       int lastDigit = 0;
       int reverse = 0;
       int tempNum = input;
      
       while(tempNum > 0) {
              lastDigit = tempNum % 10;
              reverse = (reverse * 10) + lastDigit;
              tempNum = tempNum / 10;          
       }
 
       if(reverse == input)
              return true;
       else
              return false;
             
    }
      
}