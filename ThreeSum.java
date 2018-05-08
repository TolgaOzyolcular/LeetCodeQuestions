import java.util.*;

class ThreeSum {
	
	public static void main(String[] args) {
		int[] array = {-1, 0, 1, 2, -1, -4};
		int target = 0;
		
		ThreeSum t = new ThreeSum();
		System.out.println(t.threeSum(array, target));
	}
	
    public List<List<Integer>> threeSum(int[] nums, int target) {
        List<List<Integer>> output = new ArrayList<List<Integer>>();      
        Arrays.sort(nums);
        
        for(int i = 0; i<nums.length; i++){
        		for(int j = i+1; j<nums.length; j++){
        			for(int k = j+1; k<nums.length; k++){
                    	if((nums[i] + nums[j] + nums[k]) == target) {  
                    		List<Integer> inner = new ArrayList<Integer>();
                    		inner.add(nums[i]);
                    		inner.add(nums[j]);
                    		inner.add(nums[k]);    
                    		output.add(inner);
                    	}                   	
                 }
            }
        }
        
        //Remove duplicates
        
        HashSet <List<Integer>> mySet = new HashSet<List<Integer>>(output);        
        output = new ArrayList<List<Integer>>(mySet);
        
        return output;
    }
}