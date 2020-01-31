
public class InvertBinaryTree {
	public TreeNode invertTree(TreeNode root) {
        LinkedList<TreeNode> nodes = new LinkedList<TreeNode>();
        nodes.add(root);
        TreeNode current;
        
        while(!nodes.isEmpty()){
            current = nodes.getFirst();
            nodes.removeFirst();
            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;
            
            if(current.left != null){
                //current = current.left;
                nodes.add(current.left);
            }
            
            if (current.right != null){
                nodes.add(current.right);
            }
            
            //System.out.println(current.val);
            
            
        }
        
        return root;
    }
}
