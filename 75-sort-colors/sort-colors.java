class Solution {
    public void sortColors(int[] nums) {
        int cz = 0;
        int co = 0;
        int ct = 0;

        for(int i=0; i<nums.length; i++){ 
            if(nums[i] == 0){
                cz++;
            }else if(nums[i] == 1){
                co++;
            }else{
                ct++;
            }
        }
        int idx = 0;
        for(int j=0; j<cz; j++){
            nums[idx]=0;
            idx++;
        }
        for(int k=0; k<co; k++){
            nums[idx]=1;
            idx++;
        }
        for(int l=0; l<ct; l++){
            nums[idx]=2;
            idx++;
        }
    }
}