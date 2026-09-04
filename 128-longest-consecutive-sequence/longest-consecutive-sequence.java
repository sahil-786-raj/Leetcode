class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            hs.add(num);
        }

        int length = 0;

        for(int k : hs){
            if(!hs.contains(k-1)){
                int curr = k;
                int count = 1;

                while(hs.contains(curr + 1)){
                    curr = curr + 1;
                    count++;
                }

                length = Math.max(length, count);
            }
        }

        return length;
    }
}