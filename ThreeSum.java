import java.util.*;

public class ThreeSum {
	public static void main (String[] args) {
		int[] input = {-1, 0, 1, -2, -1, 3};
		int target = 0;
		
		System.out.println(threeSum(input));
	}
	public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<List<Integer>>();        
        int a, b, c;
               
        for(int i = 0; i < nums.length; i++) {
        		for(int j = i+1; j < nums.length; j++) {
        			for(int k = j+1; k < nums.length; k++) {
        				a = nums[i];
        				b = nums[j];
        				c = nums[k];
            			if(a+b+c == 0) {
            				List<Integer> chosenNums = new ArrayList<Integer>(Arrays.asList(a, b, c));
            				Collections.sort(chosenNums);
            				if(!output.contains(chosenNums))
            					output.add(chosenNums);
            			}
            		}
        		}
        }
        
        
        return output;
    }
}
