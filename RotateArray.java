
public class RotateArray {
	
	class Solution {
	    public void rotate(int[] nums, int k) {
	        int[] output = new int[nums.length];
	        
	        for(int i = 0; i < nums.length; i++) {
	            int index = (i + k) % nums.length;
	            
	            //output[i] = nums[index]; // rotate left
	            
	            output[index] = nums[i]; // rotate right
	        }

	        for(int i = 0; i < nums.length; i++) 
	            nums[i] = output[i]; 
	        
	        
	    
	    }
	}

}
