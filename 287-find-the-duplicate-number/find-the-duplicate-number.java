import java.util.*;

class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int p = nums[i];
            hm.put(p, hm.getOrDefault(p, 0) + 1);
        }

        for (Integer k : hm.keySet()) {
            if(hm.get(k) > 1){
                return k;
            }
        }
        return -1;
    }
}