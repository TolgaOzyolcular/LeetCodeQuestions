import java.util.*;
 
public class MedianOfTwoSortedArrays {
       public static void main (String[] args) {
              int[] nums1 = {1, 2};
              int[] nums2 = {3, 5, 6, 7};
             
              System.out.println(findMedianSortedArrays(nums1, nums2));
       }
      
       public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
              double median = 0.0;
              int index = 0;
              HashSet<Integer> set = new HashSet<>();
             
              for(int i = 0; i < nums1.length; i++) {
                     set.add(nums1[i]);
              }
             
              for(int i = 0; i < nums2.length; i++) {
                     set.add(nums2[i]);
              }
             
              ArrayList<Integer> list = new ArrayList<>(set);
             
              index = (list.size() / 2) - 1;
             
              if(list.size() % 2 == 0)
                     median = (list.get(index) + list.get(index + 1)) / 2.0;      
             
             
              else
                     median = list.get(index + 1);
             
             
              System.out.println(list);
             
              return median;
       }
}