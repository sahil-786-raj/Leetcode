class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<tickets.length; i++){
            q.add(i);
        }
        int res = 0;

        while(tickets[k] > 0){
            int curr = q.remove();

            tickets[curr]--;
            res++;

            if(tickets[curr] > 0){
                q.add(curr);
            }
        }

        return res;
    }
}