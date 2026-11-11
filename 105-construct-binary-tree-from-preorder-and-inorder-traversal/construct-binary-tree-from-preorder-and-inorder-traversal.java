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
    static int preindex = 0;

    public static int search(int[] inorder, int val, int left, int right){
        for(int i=left; i<=right; i++){
            if(inorder[i] == val){
                return i;
            }
        }
        return 0;
    }
    public static TreeNode binarytree(int[] preorder, int[] inorder, int left, int right){
        if(left > right){
            return null;
        }

        // int data = preorder[preindex];
        TreeNode root = new TreeNode(preorder[preindex]);
        int inIdx = search(inorder, preorder[preindex], left, right);
        preindex++;

        root.left = binarytree(preorder, inorder, left, inIdx-1);
        root.right = binarytree(preorder, inorder, inIdx+1, right);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preindex = 0;
        int left = 0;
        int right = preorder.length - 1;
        TreeNode root = binarytree(preorder, inorder, left, right);
        return root;
    }
}