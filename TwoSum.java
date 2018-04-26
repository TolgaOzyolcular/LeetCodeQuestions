import java.util.Arrays;
import java.util.HashMap;

/*Given an array of integers, return indices of the two numbers such that they add up to 
 * a specific target. You may assume that each input would have exactly one solution, and 
 * you may not use the same element twice.
*/

class TwoSum {
	
	public static void main(String[] args) {
	    int[] array = {2, 7, 11, 15};
	    int target = 9;
	    
	    System.out.println(Arrays.toString(twoSum(array, target)));
	}
	
	public static int[] twoSum(int[] nums, int target) {
       
		HashMap map = new HashMap();
		
		for(int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
			int number = target - nums[i];
			
			if(map.containsKey(number)) {
				return new int[] {(int) map.get(number), i};
			}				
		}
		
		throw new IllegalArgumentException("No two sum solution");	
		
		/*
		for(int i = 0; i<nums.length; i++) {
        		for(int j = i+1; j<nums.length; j++) {
        			if((nums[i] + nums[j]) == target) {
        				int[] result = {i, j};
        				return result;
        			}
        		}
        }
		
        throw new IllegalArgumentException("No two sum solution");
        */
	}	
}
