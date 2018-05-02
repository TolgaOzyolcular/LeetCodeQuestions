import java.util.Arrays;

class MedianSortedArray {
  
  public static void main (String[] args){
    int[] nums1 = {1, 2, 5, 6};
    int[] nums2 = {3, 4};
    
    MedianSortedArray t = new MedianSortedArray();
    
    System.out.println(t.findMedianSortedArrays(nums1, nums2));
  }
  
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double value = 0.0;
        int[] numsTotal = new int[nums1.length + nums2.length];    
        System.arraycopy(nums1, 0, numsTotal, 0, nums1.length);
        System.arraycopy(nums2, 0, numsTotal, nums1.length, nums2.length);
        
        Arrays.sort(numsTotal);
        
        if(numsTotal.length % 2 == 0){
          System.out.println("Even");
          double index1 = numsTotal[(numsTotal.length/2)-1];
          double index2 = numsTotal[(numsTotal.length/2)];
          value = (index1+index2)/2;
        }
        
        else{
          System.out.println("Odd");
          value = numsTotal[numsTotal.length/2];
        }
        
        return value;
  }
}