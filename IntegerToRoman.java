

public class IntegerToRoman {
	
	public static void main(String[] args) {
		String input = "1994";		
		IntegerToRoman t = new IntegerToRoman();
		System.out.println(t.intToRoman(input));		
	}
	
	public String intToRoman(String s) {
		int input = Integer.parseInt(s);	
		int numberOfTimes = 0;
		String output = "";
		
		for(int i = 0; i<s.length(); i++){
			if(input >= 1000) {
				numberOfTimes = input / 1000;
				input = input % 1000;
				
				for(int j = 0; j<numberOfTimes; j++) {
					output += "M";
				}
			}
			if(input < 1000 && input >= 500) {
				if(input >= 900) {
					output += "CM";
					numberOfTimes = input / 900;
					input = input % 900;
				}
				else {				
					numberOfTimes = input / 500;
					input = input % 500;
					
					for(int j = 0; j<numberOfTimes; j++) {
						output += "D";
					}
				}
			}
			if(input < 500 && input >= 100) {
				if(input >= 400) {
					output += "CD";
					numberOfTimes = input / 400;
					input = input % 400;
				}
				else {
					numberOfTimes = input / 100;
					input = input % 100;
					
					for(int j = 0; j<numberOfTimes; j++) {
						output += "C";
					}
				}
			}
			if(input < 100 && input >= 50) {
				if(input >= 90) {
					output += "XC";
					numberOfTimes = input / 90;
					input = input % 90;
				}
				else {
					numberOfTimes = input / 50;
					input = input % 50;
					
					for(int j = 0; j<numberOfTimes; j++) {
						output += "L";
					}
				}
			}
			if(input < 50 && input >= 10) {
				if(input >= 40) {
					output += "XL";
					numberOfTimes = input / 40;
					input = input % 40;
				}
				else {
					numberOfTimes = input / 10;
					input = input % 10;
					
					for(int j = 0; j<numberOfTimes; j++) {
						output += "X";
					}
				}
			}
			if(input < 10 && input >= 5) {
				if(input >= 9) {
					output += "IX";
					numberOfTimes = input / 9;
					input = input % 9;
				}
				else {
					numberOfTimes = input / 5;
					input = input % 5;
					
					for(int j = 0; j<numberOfTimes; j++) {
						output += "V";
					}
				}
			}
			if(input < 5 && input >= 1) {
				if(input >= 4) {
					output += "IV";
					numberOfTimes = input / 4;
					input = input % 4;
				}
				else {
					numberOfTimes = input / 1;
					input = input % 1;
					
					for(int j = 0; j<numberOfTimes; j++) {
						output += "I";
					}
				}
				
			}
		
		}

		return output;
	}

}
