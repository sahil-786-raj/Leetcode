class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
       
        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1; j<nums.length;){
                int p = j+1;
                int q = nums.length-1;
                while(p < q){
                    long sum = (long) nums[i] + nums[j] + nums[p] + nums[q];
                    if(sum < target){
                        p++;
                    }else if(sum > target){
                        q--;
                    }else{
                        List<Integer> quadruplets  = new ArrayList<>();
                        quadruplets.add(nums[i]);
                        quadruplets.add(nums[j]);
                        quadruplets.add(nums[p]);
                        quadruplets.add(nums[q]);
                    
                        result.add(quadruplets);

                        p++;
                        q--;

                        while(p<q && nums[p] == nums[p-1]){
                            p++;
                        }
                    }
                }

                j++;

                while(j<n && nums[j]==nums[j-1]){
                    j++;
                }
            }
        }
        return result;
    }
}