class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=nums2.length-1; i>=0; i--){
            while(!s.isEmpty() && nums2[s.peek()] <= nums2[i]){
                s.pop();
            }
            if(s.isEmpty()){
                hm.put(nums2[i], -1);
            }else{
                hm.put(nums2[i], nums2[s.peek()]);
            }

            s.push(i);
        }

        int arr[] = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            arr[i] = hm.get(nums1[i]);
        }

        return arr;
    }
}