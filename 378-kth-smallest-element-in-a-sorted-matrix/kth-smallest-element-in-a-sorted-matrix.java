class Solution {
    public int kthSmallest(int[][] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int row = arr.length;
        int col = arr[0].length;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                pq.add(arr[i][j]);

                if(pq.size() > k){
                    pq.poll();
                }
            }
        }

        return pq.peek();
    }
}