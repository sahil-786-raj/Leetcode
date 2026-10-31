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
     static class info{
        int dia;
        int ht;

        info(int dia, int ht){
            this.dia = dia;
            this.ht = ht;
        }
    }

    public static info diameter(TreeNode root){
        if(root == null){
            return new info(0, 0);
        }

        info leftdia = diameter(root.left);
        info rightdia = diameter(root.right);

        int dia = Math.max(Math.max(leftdia.dia, rightdia.dia), leftdia.ht + rightdia.ht);
        int ht = Math.max(leftdia.ht , rightdia.ht) + 1;
        return new info(dia, ht);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        info res = diameter(root);

        return res.dia;
    }
}