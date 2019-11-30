import java.util.*;
 
public class AddTwoNumbers {
       public static void main (String[] args) {
              LinkedList<Integer> l1 = new LinkedList<Integer>();
              LinkedList<Integer> l2 = new LinkedList<Integer>();
             
              l1.add(5);
              l1.add(5);
              l1.add(5);
             
              l2.add(6);
              l2.add(6);
              l2.add(6);
             
              System.out.println(addTwoNumbers(l1, l2));
       }
      
       public static LinkedList<Integer> addTwoNumbers (LinkedList<Integer> l1, LinkedList<Integer> l2){
              LinkedList<Integer> outputL = new LinkedList<Integer>();
              String num1 = "";
              String num2 = "";
             
              for(int i = l1.size()-1; i >= 0; i--)
                     num1 += Integer.toString(l1.get(i));
             
              System.out.println(num1);
             
              for(int i = l2.size()-1; i >= 0; i--)
                     num2 += Integer.toString(l2.get(i));
             
              System.out.println(num2);
             
              int result = Integer.parseInt(num1) + Integer.parseInt(num2);
             
              String outputS = Integer.toString(result);
             
              for(int i = 0; i < outputS.length(); i++) {
                     outputL.add(Character.getNumericValue(outputS.charAt(i)));
              }
             
              return outputL;
       }
      
}