class Solution {
    public int maxProduct(int[] nums) {
        int cp = 1;
        int cpp = 1;
        int mp = Integer.MIN_VALUE;
        int mpp = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            cp = cp * nums[i];
            mp = Math.max(cp, mp);

            if(cp == 0){
               cp = 1;
            }
        }

        for(int i=nums.length-1; i>=0; i--){
            cpp = cpp * nums[i];
            mpp = Math.max(cpp, mpp);

            if(cpp == 0){
               cpp = 1;
            }
        }

        int pro = Math.max(mp , mpp);

        return pro;
    }
}