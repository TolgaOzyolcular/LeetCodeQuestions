class Palindrome {
  
  public static void main(String[] args){
    String input = "cbbd";
    
    Palindrome t = new Palindrome();
    System.out.println("Input: " + input);
    System.out.println("Output: " + t.longestPalindrome(input));
  }
  
  public String longestPalindrome(String s){
    int count = 0;
    String longestPalindrome = "";
    StringBuffer palindrome = new StringBuffer();
    
    for(int i = 0; i<s.length(); i++){
      palindrome.append(s.charAt(i));
      for(int j = i+1; j<s.length(); j++){
        palindrome.append(s.charAt(j));
        if(isPalindrome(palindrome.toString())){
          if(count<palindrome.length()){
            longestPalindrome = palindrome.toString();
            count = palindrome.length();
          }
        }
      }
      palindrome.setLength(0);
    }
    return longestPalindrome;
  }
  
  public Boolean isPalindrome(String input){
    StringBuffer inputReverse = new StringBuffer();
    
    inputReverse.append(input);
    inputReverse.reverse();
    
    String compare = inputReverse.toString();
    
    if(input.equals(compare))
      return true;
    
    else
      return false;
  }
  
}