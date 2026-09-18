class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int totalsum = 0;
        int mod = 1000000007;
        int pse[] = new int[n];
        int nse[] = new int[n];

        Stack<Integer> s1 = new Stack<>();

        for(int i=0; i<n; i++){
            while(!s1.isEmpty() && arr[i] < arr[s1.peek()]){
                s1.pop();
            }

            if(s1.isEmpty()){
                pse[i] = -1;
            }else{
                pse[i] = s1.peek();
            }

            s1.push(i);
        }

        Stack<Integer> s2 = new Stack<>();

        for(int i=n-1; i>=0; i--){
            while(!s2.isEmpty() && arr[i] <= arr[s2.peek()]){
                s2.pop();
            }

            if(s2.isEmpty()){
                nse[i] = n;
            }else{
                nse[i] = s2.peek();
            }

            s2.push(i);
        }

        for(int i=0; i<n; i++){
            long left = i - pse[i];
            long right = nse[i] - i;

            totalsum = (int)(totalsum + (left * right * arr[i]) % mod) % mod;
        }

        return totalsum;
    }
}