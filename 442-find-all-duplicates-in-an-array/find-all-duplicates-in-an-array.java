class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> a = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        for(Integer keys: hm.keySet()){
            if(hm.get(keys) > 1){
                a.add(keys);
            }
        }

        return a;
    }
}