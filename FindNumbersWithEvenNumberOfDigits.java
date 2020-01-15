
public class FindNumbersWithEvenNumberOfDigits {
	
	public static void main(String[] args) {
		int[] input = {12,345,2,6,7896};
		
		System.out.println(findNumbers(input));
	}
	
	public static int findNumbers(int[] nums) {
        int output = 0;
        
        for(int i = 0; i < nums.length; i++) {
        		int length = String.valueOf(nums[i]).length();
        		
        		if(length % 2 == 0) {
        			output++;
        		}
        }
        
        return output;
    }
}
