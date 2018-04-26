import java.util.LinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class addTwoNumbers {
	
	public static void main (String[] args) {
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		
		l1.add(2);
		l1.add(4);
		l1.add(3);
		
		l2.add(5);
		l2.add(6);
		l2.add(4);
		
		addTwoNumbers t = new addTwoNumbers(); //in order to call non-static method from static method
		
		System.out.println(t.addTwoNumbers(l1,l2));
		
	}
	
	Boolean carry = false;
	int index = 0;
	LinkedList result = new LinkedList();
	
    public LinkedList addTwoNumbers(LinkedList l1, LinkedList l2) {
    		int addition = 0;
    		
    		if(l1.size() >= l2.size()) {
    			if(carry == true) {
    				addition = ((Integer) l1.get(index)) + ((Integer) l2.get(index)) + 1;
    				
    				if(addition >= 10) {
    					carry = true;
    				}
    				else	{
    					carry = false;
    				}
    				
    				addition = addition % 10;
	    			index++;
	    			//System.out.println(addition);
	    			result.add(addition);
	    			
	    			if(!(index >= l1.size())) {
	    				addTwoNumbers(l1, l2);
	    			}
	    				
	    			
    			}
    			
    			else {
    				addition = ((Integer) l1.get(index)) + ((Integer) l2.get(index));
    				
    				if(addition >= 10) {
    					carry = true;
    				}
    				else	{
    					carry = false;
    				}
    				
    				addition = addition % 10;
	    			index++;
	    			//System.out.println(addition);
	    			result.add(addition);
	    			
	    			if(!(index >= l1.size())) {
	    				addTwoNumbers(l1, l2);
	    			}
    			}

    		}
    		
    		else{
    			if(carry == true) {
    				addition = ((Integer) l1.get(index)) + ((Integer) l2.get(index)) + 1;
    				
    				if(addition >= 10) {
    					carry = true;
    				}
    				else	{
    					carry = false;
    				}
    				
    				addition = addition % 10;
	    			index++;
	    			//System.out.println(addition);
	    			result.add(addition);
	    			
	    			if(!(index >= l2.size())) {
	    				addTwoNumbers(l1, l2);
	    			}
	    				
	    			
    			}
    			
    			else {
    				addition = ((Integer) l1.get(index)) + ((Integer) l2.get(index));
    				
    				if(addition >= 10) {
    					carry = true;
    				}
    				else	{
    					carry = false;
    				}
    				
    				addition = addition % 10;
	    			index++;
	    			//System.out.println(addition);
	    			result.add(addition);
	    			
	    			if(!(index >= l2.size())) {
	    				addTwoNumbers(l1, l2);
	    			}
    			}

    		}
    		
    		return result; 
    }
}