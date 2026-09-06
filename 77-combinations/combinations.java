class Solution {
    public static void combination(List<List<Integer>> ans, int i, int arr[], List<Integer> temp, int k){
        if(temp.size() == k){
            ans.add(new ArrayList<>(temp));
            return;
        }

        if (i == arr.length) {
            return;
        }


        temp.add(arr[i]);
        combination(ans, i+1, arr, temp, k);
        temp.remove(temp.size()-1);
        combination(ans, i+1, arr, temp, k);
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int arr[] = new int[n];

        for(int i=1; i<=n; i++){
            arr[i-1] = i;
        }

        combination(ans, 0, arr, temp, k);

        return ans;
    }
}