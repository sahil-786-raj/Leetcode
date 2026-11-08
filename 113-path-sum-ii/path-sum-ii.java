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
    public static void solve(TreeNode root, int sum, int targetSum, List<List<Integer>> res,  ArrayList<Integer> list){
        if(root == null){
            return;
        }

        list.add(root.val);
        sum += root.val;

        if(root.left == null && root.right == null){
            if(sum == targetSum){
                res.add(new ArrayList<>(list));
            }
        }

        solve(root.left, sum, targetSum, res, list);
        solve(root.right, sum, targetSum, res, list);

        list.remove(list.size() - 1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        solve(root, 0, targetSum, res, list);

        return res;
    }
}