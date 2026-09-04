class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int arr1[] = new int[n/2];
        int arr2[] = new int[n/2];

        int i = 0;
        int k = 0;
        int l = 0;
        while(i<n){
            if(nums[i] > -1){
                arr1[k] = nums[i]; 
                k++;
            }else{
                arr2[l] = nums[i];
                l++;
            }
            i++;
        }

        int p = 0;
        int q = 0;
        while(p < arr1.length ){
            nums[q] = arr1[p];
            nums[q+1] = arr2[p]; 
            p++;
            q=q+2;
        }

        return nums;
    }
}