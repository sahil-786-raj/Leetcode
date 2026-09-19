class Solution {
    static class sort implements Comparable<sort>{  
        int key;
        int value;

        public sort(int key, int value){
            this.key = key;
            this.value = value;
        }

        @Override
        public int compareTo(sort s2){

            if(this.value != s2.value){
                return this.value - s2.value;
            }

            return s2.key - this.key;
        }
    }

    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<sort> pq = new PriorityQueue<>();

        for(Integer keys : hm.keySet()){
            pq.add(new sort(keys, hm.get(keys)));
        }
        
        int arr[] = new int[n];
        int j = 0;
        while(!pq.isEmpty()){
            sort p =  pq.poll();

            for(int i=0; i<p.value; i++){
                arr[j] = p.key;
                j++;
            }
            
        }

        return arr;

    }
}