class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> ts = new TreeSet<>();

        for(int i=0; i<nums.length; i++){
            int n = nums[i];
            ts.add(n);
        }

        int k=0;
        for(Integer j : ts){
            nums[k] = j;
            k++; 
        }

        return k;
    }
}