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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> leftq = new LinkedList<>();
        Queue<TreeNode> rightq = new LinkedList<>();

        leftq.add(p);
        rightq.add(q);

        while(!leftq.isEmpty() && !rightq.isEmpty()){
            TreeNode lefttree = leftq.remove();
            TreeNode righttree = rightq.remove();

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

            rightq.add(righttree.left);
            rightq.add(righttree.right);
        }

        return true;
    }
}