class Solution {
    HashSet<List<Integer>> hs = new HashSet<>();
    void combinecandidate(int[] arr,int i, List<Integer> combi, List<List<Integer>> ans, int target){
        int n = arr.length;
        
        if(i == n  || target < 0){
            return ;
        }

        if(target == 0){
            if(!hs.contains(new ArrayList(combi))){
                ans.add(new ArrayList(combi));
                hs.add(new ArrayList(combi));
            }
            return ;
        }

        combi.add(arr[i]);
        combinecandidate(arr, i+1, combi, ans, target-arr[i]);
        combinecandidate(arr, i, combi, ans, target-arr[i]);
        combi.remove(combi.size() - 1);
        combinecandidate(arr, i+1, combi, ans, target);
    }

    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combi = new ArrayList<>();

        combinecandidate(arr, 0, combi, ans, target);

        return ans;
    }
}