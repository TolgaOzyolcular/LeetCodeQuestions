import java.util.*;
 
public class TwoSum {
       public static void main (String[] args) {
              int[] input = {2,7,11,15};
              int target = 9;
             
              System.out.println(Arrays.toString(twoSum(input, target)));
             
       }
      
       public static int[] twoSum (int[] input, int target) {
 
              Map<Integer, Integer> numMap = new HashMap<>();
             
              for(int i = 0; i < input.length; i++) {
                     int complement = target - input[i];
                    
                     if(numMap.containsKey(complement))
                           return new int[] {numMap.get(complement), i};
                    
                     else
                           numMap.put(input[i], i);
              }
             
              return null;
       }
      
       /*
       public static int[] twoSum (int[] input, int target) {
              int[] sum = new int[2];
              int x = 0;
              int y = 0;
             
              for(int i = 0; i < input.length; i++) {
                     for(int j = i+1; j < input.length; j++) {
                           if(input[i] > target || input[j] > target)
                                  return sum;
                          
                           if(input[i] + input [j] == target) {
                                  x = i;
                                  y = j;
                                 
                                  sum[0] = x;
                                  sum[1] = y;
                                 
                                  return sum;
                           }
                     }
              }
             
              return sum;
       }
       */
}