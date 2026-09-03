class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<n; i++){
            int num = nums[i];
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        for (Integer k : hm.keySet()) {
            if(hm.get(k) > 1){
                return true;
            }
        }

        return false;
    }
}