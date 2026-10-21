class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int mis;
        int rep=0;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<n; i++){
            int num = nums[i];
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        for(Integer key : hm.keySet()){
            if(hm.get(key) > 1){
                rep = key;
            }
        }

        int obssum = 0;
        for(int i=0; i<n; i++){
            obssum += nums[i];
        }

        int p = obssum - rep;

        int actsum = 0;
        for(int i=1; i<=n; i++){
            actsum += i;
        }

        mis = actsum - p;

        int arr[] = new int[2];
        arr[0] = rep;
        arr[1] = mis;

        return arr;
    }
}