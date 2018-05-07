

class RomanToInteger {
	
	public static void main(String[] args) {
		String input = "MCMXCIV";		
		RomanToInteger t = new RomanToInteger();
		System.out.println(t.romanToInt(input));		
	}
	
    public int romanToInt(String s) {
    		int firstNumber = 0;
    		int secondNumber = 0;
    		int output = 0;
    		
    		for(int i = 0; i<s.length(); i++) {
    			
    			firstNumber = numbers(s.charAt(i));
    			
    			if((i+1)<s.length()) {
    				
    				secondNumber = numbers(s.charAt(i+1));
    				
    				if(firstNumber >= secondNumber) 
    					output += firstNumber;  
    				   				
    				else {
    					output += (secondNumber - firstNumber);
    					i++;
    				}
    			}
    			
    			else {
    				output += numbers(s.charAt(i));
    			}
    			
    			   			
    		}
    	
    		return output;
        
    }
    
    public int numbers(char i) {
		if(i == 'I') 
		return 1;
	
		else if(i == 'V') 
			return 5;
		
		else if(i == 'X') 
			return 10;
		
		else if(i == 'L') 
			return 50;
		
		else if(i == 'C') 
			return 100;
		
		else if(i == 'D') 
			return 500;
		
		else if(i == 'M') 
			return 1000;
		
		else
			return 0;
	}
}