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
    public int maxLevelSum(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int ans = 0;
        int level = 0;

        while(!q.isEmpty()){
            TreeNode currnode = q.remove();
            if(currnode == null){
                level++;
                int sum = 0;
                for(int i=0; i<list.size(); i++){
                    sum += list.get(i);
                }

                if(sum > max){
                    max = sum;
                    ans = level;
                }

                list = new ArrayList<>();
                
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                list.add(currnode.val);
                if(currnode.left != null){
                    q.add(currnode.left);
                }

                if(currnode.right != null){
                    q.add(currnode.right);
                }
            }
        }

        return ans;
    }
}