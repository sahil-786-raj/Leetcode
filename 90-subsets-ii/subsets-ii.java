class Solution {
    void findsubset(int[] arr, int i, List<Integer> subset, List<List<Integer>> res){
        int n = arr.length;
        if(i == n){
            res.add(new ArrayList<>(subset));
            return;
        }

        subset.add(arr[i]);
        findsubset(arr, i+1, subset, res);
        subset.remove(subset.size() - 1);

        int idx = i+1;
        while(idx<n && arr[idx] == arr[idx-1]){
            idx++;
        }
        findsubset(arr, idx, subset, res);
    }

    public List<List<Integer>> subsetsWithDup(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        findsubset(arr, 0, subset, res);

        return res;
    }
}