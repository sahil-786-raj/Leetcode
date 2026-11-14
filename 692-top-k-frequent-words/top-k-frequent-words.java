class Solution {
    public static class pair implements Comparable<pair>{ 
        String key;
        int value;

        public pair(String key, int value){
            this.key = key;
            this.value = value;
        }

        @Override
        public int compareTo(pair p2){
            if(this.value == p2.value){
                return p2.key.compareTo(this.key);
            }
            return this.value - p2.value;
        }
    }
    public List<String> topKFrequent(String[] words, int k1) {
        HashMap<String, Integer> hm = new HashMap<>();
        PriorityQueue<pair> pq = new PriorityQueue<>();
        ArrayList<String> list = new ArrayList<>();

        for(int i=0; i<words.length; i++){
            String s = words[i];
            hm.put(s, hm.getOrDefault(s, 0) + 1);
        }

        for (String k : hm.keySet()) {
            pq.add(new pair(k, hm.get(k)));
            if(pq.size() > k1){
                pq.remove();
            }
        }

        while(!pq.isEmpty()){
            list.add(pq.peek().key);
            pq.remove();
        }
        Collections.reverse(list);

        return list;
    }
}