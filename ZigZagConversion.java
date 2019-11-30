import java.util.*;

public class ZigZagConversion {
	public static void main (String[] args) {
		String input = "PAYPALISHIRING";
		int numRows = 3;
		
		System.out.println(convert(input, numRows));
	}
	
	public static String convert(String input, int numRows) {
        String result = "";
        
        int index = 0;
        
        ArrayList<Character>[] characters = new ArrayList[numRows];
        
        for (int i = 0; i < numRows; i++) { 
            characters[i] = new ArrayList<Character>(); 
        } 
        
        while(index < input.length()) {  
        		if(index < input.length()) {
	        		for(int row = 0; row < numRows; row++) {   
	        			//System.out.println("Letter: " + input.charAt(index) + " Row: " + row + " Index: " + index + " Loop A");
	        			if(index < input.length()) {
	        				characters[row].add(input.charAt(index));
	        				index++;
	        			}
	        			else
	        				break;
	        		}
        		}
        		else
        			break;
        		
        		if(index < input.length()) {
	        		if(numRows >= 3) {
		        		for(int row = numRows-2; row > 0; row--) {	
		        			System.out.println("Letter: " + input.charAt(index) + " Row: " + row + " Index: " + index + " Loop B");
		        			if(index < input.length()) {
		        				characters[row].add(input.charAt(index));
		        				index++;        				
		        			}
		        			else
		        				break;	        			
		        		}
	        		}		  
        		}
        		else
        			break;
        }
        
		for(int row = 0; row < numRows; row++) {
			for(int i = 0; i < characters[row].size(); i++)
				result += characters[row].get(i);
		}
       
        return result;
    }
}
