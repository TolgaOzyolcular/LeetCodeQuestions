import java.util.*;

public class MinimumFlipsToMakeAOrBEqualToC {
	
	static int minFlips(int a, int b, int c) {
        int numFlips = 0;

        String aString = Integer.toBinaryString(a);
        String bString = Integer.toBinaryString(b);
        String cString = Integer.toBinaryString(c);
        int[] binaries = {aString.length(), bString.length(), cString.length()};

        Arrays.sort(binaries);

        if(aString.length() < binaries[2]) {
            int length = aString.length();
            for(int i = 0; i < (binaries[2]- length); i++) {
                aString = '0' + aString;
            }
        }

        if(bString.length() < binaries[2]) {
            int length = bString.length();
            for(int i = 0; i < (binaries[2] - length); i++) {
                bString = '0' + bString;
            }
        }

        if(cString.length() < binaries[2]) {
            int length = cString.length();
            for(int i = 0; i < (binaries[2]- length); i++) {
                cString = '0' + cString;
            }
        }                             

        for(int i = 0; i < cString.length(); i++) {
            if((aString.charAt(i) | bString.charAt(i)) != cString.charAt(i)){
                if((aString.charAt(i) != cString.charAt(i)) && (bString.charAt(i) != cString.charAt(i))){
                    if(aString.charAt(i) == '0' || bString.charAt(i) == '0')
                        numFlips++;
                    else
                        numFlips+=2;
                }
                                                            
                else
                        numFlips++;                                      
            }
        }

        return numFlips;
    }

}
