class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int arr[] = new int[2];

        for(int i=0; i<n; i++){
            int num = nums[i];
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        int j = 0;
        for(Integer keys : hm.keySet()){
            if(hm.get(keys) < 2){
                arr[j] = keys;
                j++;
            }
        }

        return arr;
    }
}