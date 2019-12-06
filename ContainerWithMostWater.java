import java.util.*;

public class ContainerWithMostWater {
	public static void main (String[] args) {
		int[] height = {1,8,6,2,5,4,8,3,7};
		
		System.out.println(maxArea(height));
	}
	
	public static int maxArea(int[] height) {
        int area = 0;
        int pointerLeft = 0;
        int pointerRight = height.length-1;
        
        while (pointerLeft != pointerRight) {
        		int width = pointerRight - pointerLeft;
        		
        		if(height[pointerLeft] < height[pointerRight]) {
        			if((height[pointerLeft] * width) > area)
        				area = height[pointerLeft] * width;
        			
        			pointerLeft++;
        		}
        		
        		else {
        			if((height[pointerRight] * width) > area)
        				area = height[pointerRight] * width;
        			
        			pointerRight--;
        		}
        		
        		
        			
        }
        
        return area;
    }
}
