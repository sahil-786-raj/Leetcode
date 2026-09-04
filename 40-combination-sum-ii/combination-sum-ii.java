class Solution {
    void combinecandidate(int[] arr,int i, List<Integer> combi, List<List<Integer>> ans, int target){
        int n = arr.length;

        if(target == 0){
            ans.add(new ArrayList<>(combi));
            return;
        } 
        
        if(i == n  || target < 0){
            return;
        }

        combi.add(arr[i]);
        combinecandidate(arr, i+1, combi, ans, target-arr[i]);
        combi.remove(combi.size() - 1);

        int idx = i+1;
        while(idx<n && arr[idx] == arr[idx-1]){
            idx++;
        }
        combinecandidate(arr, idx, combi, ans, target);
    }

    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combi = new ArrayList<>();

        combinecandidate(arr, 0, combi, ans, target);

        return ans;
    }
}