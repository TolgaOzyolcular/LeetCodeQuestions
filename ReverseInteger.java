class ReverseInteger {
  
  public static void main(String[] args){
    int input = -123;
    
    ReverseInteger t = new ReverseInteger();
    System.out.println(t.reverse(input));
    
  }
  
  public int reverse(int x) {      
      String input = String.valueOf(Math.abs(x));
      String output = "";
      
      if(input != null){
        for(int i = (input.length()-1); i>=0; i--){
          output += input.charAt(i); 
        }
      }
      
      if(x>=0){
        return Integer.parseInt(output);
      }
      else
         return (Integer.parseInt(output) * -1);
       
  }
  
}