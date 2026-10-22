class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                nums[i] = -1;
            }
        }

        //<sum, index>
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, -1);

        int sum = 0;
        int maxlen = 0;

        for(int i=0; i<n; i++){
            sum += nums[i];
            if(hm.containsKey(sum)){
                int len = i - hm.get(sum);
                maxlen = Math.max(len, maxlen);
            }else{
                hm.put(sum, i);
            }
        }

        return maxlen;
    }
}