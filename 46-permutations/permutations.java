class Solution {
    public static void permutation(int[] nums, List<List<Integer>> ans, ArrayList<Integer> list, boolean[] used){
        if(nums.length == list.size()){
            ans.add(new ArrayList<>(list));
            return;
        }
    
        for(int j=0; j<nums.length; j++){
            if(used[j]){
                continue;
            }

            list.add(nums[j]);
            used[j] = true;

            permutation(nums, ans, list, used);

            list.remove(list.size()-1);
            used[j] = false;
        }
    } 

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        permutation(nums, ans, list, used);

        return ans;

    }
}