import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count=0;
        int presum[] = new int[n];
        presum[0] = nums[0];

        for(int i=1; i<n; i++){
            presum[i] = presum[i-1] + nums[i];
        }

        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int j=0; j<n; j++){
            int p = presum[j];
            if(presum[j]== k){
                count++;
            }

            int val = presum[j] - k;
            if (hm.containsKey(val)) {
                count += hm.get(val);
            }
            hm.put(p, hm.getOrDefault(p, 0) + 1);
        }

        return count;
    }
}