
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        for(int i = 1; i<preorder.length ; i++){
            root = helper(root,preorder[i]);
        }
        return root;
    }
    public TreeNode helper(TreeNode root , int key){
        if(root==null){
            return new TreeNode(key);
        }
        if(key>root.val){
            root.right= helper(root.right,key);
        }
        if(key<root.val){
            root.left= helper(root.left,key);
        }
        return root;
    }
}