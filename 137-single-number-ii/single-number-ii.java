class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            int num = nums[i];
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        for (Integer k : hm.keySet()) {
            if(hm.get(k) < 2){
                return k;
            }
        }
        return -1;
    }
}