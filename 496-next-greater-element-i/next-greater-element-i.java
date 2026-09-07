class Solution {
    public static int[] nextgreater(int[] nums2){
        Stack<Integer> s = new Stack<>();
        int arr[] = new int[nums2.length];
        for(int i=nums2.length-1; i>=0; i--){

            while(!s.isEmpty() && nums2[s.peek()] <= nums2[i]){
                s.pop();
            }

            if(s.isEmpty()){
                arr[i] = -1;
            }else{
                arr[i] = nums2[s.peek()];
            }

            s.push(i);
        }
        return arr;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[] = nextgreater(nums2);
        int ans[] = new int[nums1.length];
        
        for(int i=0; i<nums1.length; i++){
            int j = 0;
            while(nums1[i] != nums2[j]){
                j++;
            }

            ans[i] = arr[j];
        }

        return ans;
    }
}