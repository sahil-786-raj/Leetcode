class Solution {
    HashSet<ArrayList<Integer>> hs = new HashSet<>();
    void findsubset(int[] arr, int i, List<Integer> subset, List<List<Integer>> res){
        int n = arr.length;
        if(i == n){
            if(!hs.contains(new ArrayList<>(subset))){
                res.add(new ArrayList<>(subset));
                hs.add(new ArrayList<>(subset));
            }
            return;
        }

        subset.add(arr[i]);
        findsubset(arr, i+1, subset, res);
        subset.remove(subset.size() - 1);
        findsubset(arr, i+1, subset, res);
    }

    public List<List<Integer>> subsetsWithDup(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        findsubset(arr, 0, subset, res);

        return res;
    }
}