class Solution {
    static class mostfrequent implements Comparable<mostfrequent>{  
        int key;
        int value;

        public mostfrequent(int key, int value){
            this.key = key;
            this.value = value;
        }

        @Override
        public int compareTo(mostfrequent m2){
            return this.value - m2.value;
        }
    }   
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<mostfrequent> pq = new PriorityQueue<>(); 

        for(Integer keys : hm.keySet()){
            pq.add(new mostfrequent(keys, hm.get(keys)));
            if(pq.size() > k) {
                pq.poll();
            }
        }

        int arr[] = new int[k];
        for(int j=0; j<k; j++){
            arr[j] = pq.poll().key;
        }

        return arr;
    }
}