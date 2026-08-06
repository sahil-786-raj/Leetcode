import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
    
        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i]) + 1);
            }else{
                hm.put(nums[i],  1);
            }
        }
        
        Set<Integer> keys =  hm.keySet();
        for (Integer k :keys) {
            if(hm.get(k) == 1){
                return k;
            }
        }

        return -1;
    }
}