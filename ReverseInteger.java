public class ReverseInteger {
      
       public static void main(String[] args) {
              int input = -123;
             
              System.out.println(reverse(input));
             
       }
      
       public static int reverse(int input) {
           int reversed = 0;
    
           String initialString = Integer.toString(Math.abs(input));
           String reversedString = "";
          
           for(int i = initialString.length()-1; i >= 0; i--)
                 reversedString += initialString.charAt(i);
           
           try{
        	   		reversed = Integer.parseInt(reversedString);
        	   }
           
           catch(Exception NumberFormatException){
        	   		reversed = 0;
        	   }
               
           if(input < 1)
                 reversed  = reversed * -1;
          
           return reversed;
       }
 
}