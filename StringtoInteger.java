import java.util.regex.*;

class StringtoInteger {
  public static void main (String[] args){
    String input = "-91283472332";    
    
    StringtoInteger t = new StringtoInteger();    
    System.out.println(t.myAtoi(input));
  }
  
  public int myAtoi(String str) {
    str = str.replaceAll(" ","");
    int output = 0;

    if(str.isEmpty() || (!Character.isDigit(str.charAt(0)) && str.charAt(0) != '-')){
      return 0;
    }
    
    else{
      try{
        Pattern pattern = Pattern.compile(".\\d+");
        Matcher matcher = pattern.matcher(str);
        matcher.find();
        str = matcher.group();
        output = Integer.parseInt(str);
      }
      
      catch(NumberFormatException e){
        return -2147483648;
      }
    }
    
    return output;
  }
}