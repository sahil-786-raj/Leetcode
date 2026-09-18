class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<nums1.length; i++){
            int num = nums1[i];
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        int[] arr = new int[Math.min(nums1.length, nums2.length)];
        int j = 0;

        for(int i=0; i<nums2.length; i++){
            int num = nums2[i];
           if(hm.getOrDefault(num, 0) > 0){
                arr[j] = num;
                j++;
                hm.put(num, 0);
           }
        }

        return Arrays.copyOf(arr, j);
    }
}