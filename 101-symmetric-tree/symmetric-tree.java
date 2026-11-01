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
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }

        Queue<TreeNode> leftq = new LinkedList<>();
        Queue<TreeNode> rightq = new LinkedList<>();
         
        leftq.add(root.left);
        rightq.add(root.right);

        while(!leftq.isEmpty() && !rightq.isEmpty()){
            TreeNode lefttree = leftq.poll();
            TreeNode righttree = rightq.poll();

            if(lefttree == null && righttree == null){
                continue;
            }
            if(lefttree == null || righttree == null){
                return false;
            }
            if(lefttree.val != righttree.val){
                return false;
            }

            leftq.add(lefttree.left);
            leftq.add(lefttree.right);

            rightq.add(righttree.right);
            rightq.add(righttree.left);
        }

        return true;
    }
}