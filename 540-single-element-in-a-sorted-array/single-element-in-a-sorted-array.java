class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        int s = 0 ;
        int e = n-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(mid == 0 && nums[mid] != nums[1]){
                return nums[mid];
            }

            if(mid == n-1 && nums[n-1] != nums[mid-2]){
                return nums[mid];
            }

            if(nums[mid-1] != nums[mid] && nums[mid+1] != nums[mid]){
                return nums[mid];
            }

            if(mid%2 == 0){
                if(nums[mid] == nums[mid+1]){
                    s = mid+1;
                }
                if(nums[mid] == nums[mid-1]){
                    e = mid-1;
                }
            }else{
                if(nums[mid] == nums[mid+1]){
                    e = mid-1;
                }
                if(nums[mid] == nums[mid-1]){
                    s = mid+1;
                }
            }            
        }

        return -1;
    }
}