
public class SubtractTheProductAndSumOfDigitsOfAnInteger {
	public static void main (String[] args) {
		int input = 234;
		
		System.out.println(subtractProductAndSum(input));
	}
	
	public static int subtractProductAndSum(int n) {
		int tempProduct = 1;
        int tempSum = 0;
        int number = n;
        
        while (number > 0) {
            tempProduct = tempProduct * (number % 10);
            number = number / 10;
        }
        
        number = n;
        
        while (number > 0) {
        		tempSum = tempSum + (number % 10);
            number = number / 10;
        }
        
        return (tempProduct - tempSum);
    }
}
