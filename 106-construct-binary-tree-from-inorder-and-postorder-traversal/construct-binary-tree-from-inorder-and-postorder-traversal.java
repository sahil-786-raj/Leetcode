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
    static int postindex;

    public static int search(int[] inorder, int val, int left, int right){
        for(int i=left; i<=right; i++){
            if(inorder[i] == val){
                return i;
            }
        }
        return 0;
    }
    public static TreeNode binarytree(int[] inorder, int[] postorder, int left, int right){
        if(left > right || postindex < 0){
            return null;
        }

        TreeNode root = new TreeNode(postorder[postindex]);
        int inIdx = search(inorder, postorder[postindex], left, right);
        postindex--;
         
        root.right = binarytree(inorder, postorder, inIdx+1, right);
        root.left = binarytree(inorder, postorder, left, inIdx-1);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postindex = postorder.length - 1;
        int left = 0;
        int right = inorder.length - 1;
        TreeNode root = binarytree(inorder, postorder, left, right);
        return root;
    }
}