class Solution {

    static class pair implements Comparable<pair>{
        int num1;
        int num2;
        int sum;
        int i;
        int j;

        public pair(int num1, int num2, int sum, int i, int j) {
            this.num1 = num1;
            this.num2 = num2;
            this.sum = sum;
            this.i = i;
            this.j = j;
        }

        @Override
        public int compareTo(pair p2){
            return this.sum - p2.sum;
        }
    }

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        List<List<Integer>> res = new ArrayList<>();

        if(nums1.length == 0 || nums2.length == 0 || k == 0) {
            return res;
        }

        PriorityQueue<pair> pq = new PriorityQueue<>();

        for(int i = 0; i < Math.min(nums1.length, k); i++) {
            pq.add(new pair(nums1[i], nums2[0], nums1[i] + nums2[0], i, 0));
        }

        while(k > 0 && !pq.isEmpty()) {

            pair p = pq.remove();

            List<Integer> list = new ArrayList<>();

            list.add(p.num1);
            list.add(p.num2);

            res.add(list);

            k--;
            
            if(p.j + 1 < nums2.length) {

                int nextJ = p.j + 1;

                pq.add(new pair(nums1[p.i], nums2[nextJ], nums1[p.i] + nums2[nextJ], p.i, nextJ));
            }
        }

        return res;
    }
}