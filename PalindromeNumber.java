class PalindromeNumber {
  
  public static void main(String[] args){
    int input = 10;
    
    PalindromeNumber t = new PalindromeNumber();
    System.out.println(t.isPalindrome(input));    
  }
  
  public boolean isPalindrome(int x) {    
    String input = Integer.toString(x);
    StringBuffer reverse = new StringBuffer();
    reverse.append(input);
    reverse.reverse();
    
    if(input.equals(reverse.toString())){
      return true;
    }    
    else
      return false;   
  }
}