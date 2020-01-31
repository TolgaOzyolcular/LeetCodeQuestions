import java.util.*;

public class SecondMinimumNodeInABinaryTree {

	 public class TreeNode {
	    int val;
	    TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
	 
	
	public int findSecondMinimumValue(TreeNode root) {
        
        Stack<TreeNode> nodes = new Stack<TreeNode>();
        TreeNode currentNode = root;
        HashSet<Integer> allNodes = new HashSet<Integer>();
        
        while(!nodes.isEmpty() || currentNode != null){
            if(currentNode != null){
                nodes.push(currentNode);
                allNodes.add(currentNode.val);
                currentNode = currentNode.left;
            }
            else{
                currentNode = nodes.pop();
                currentNode = currentNode.right;
            }
        }
        
        allNodes.remove(Collections.min(allNodes));
        
        
        if(!allNodes.isEmpty())
            return Collections.min(allNodes);
        else{
            return -1;
        }
    }

}
