/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static TreeNode root = null;
    public static TreeNode buildBST(TreeNode root, int val){
        if(root == null){
            root = new TreeNode(val, null, null);
            return root;
        }
        if(root.val > val){
            root.left = buildBST(root.left, val);
        }else if(root.val < val){
            root.right = buildBST(root.right, val);
        }
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = null;
        for(int i=0; i<preorder.length; i++){
            root = buildBST(root, preorder[i]);
        }
        return root;
    }
}