import java.util.*;

public class FindLargestValueInEachTreeRow {

	 public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }


	    public List<Integer> largestValues(TreeNode root) {
	        ArrayList<Integer> largestValues = new ArrayList<Integer>();
	        Stack<TreeNode> nodes = new Stack<TreeNode>();
	        ArrayList<TreeNode> visited = new ArrayList<TreeNode>();
	        
	        if(root != null){
	            TreeNode current = root;
	            int rowCount = 1;

	            nodes.push(current);
	            largestValues.add(current.val);
	            //System.out.println("node: " + current.val + " row: "+ rowCount);

	            while(!nodes.isEmpty()){
	                if(current.left != null && !visited.contains(current.left)){
	                    current = current.left;
	                    nodes.push(current);
	                    rowCount++;
	                    if(largestValues.size() < rowCount)
	                        largestValues.add(current.val);
	                    else if(largestValues.get(rowCount-1) < current.val)
	                        largestValues.set(rowCount-1, current.val);
	                }

	                else if(current.right != null && !visited.contains(current.right)){ 
	                    current = current.right;
	                    nodes.push(current);
	                    rowCount++;
	                    if(largestValues.size() < rowCount)
	                        largestValues.add(current.val);
	                    else if(largestValues.get(rowCount-1) < current.val)
	                        largestValues.set(rowCount-1, current.val);
	                }

	                else{
	                    visited.add(nodes.pop());
	                    if(!nodes.isEmpty())
	                        current = nodes.peek();
	                    else
	                        break;
	                    rowCount--;
	                }

	                //System.out.println("node: " + current.val + " row: "+ rowCount);

	                //System.out.println(largestValues);
	            }
	        }
	        return largestValues; 
	            
	    }
	    
	        
	}