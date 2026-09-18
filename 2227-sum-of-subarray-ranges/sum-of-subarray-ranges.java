class Solution {
    public long subArrayRanges(int[] arr) {
        int n = arr.length;
        long totalminsum = 0;
        long totalmaxsum = 0;

        int pse[] = new int[n];
        int nse[] = new int[n];

        int ple[] = new int[n];
        int nle[] = new int[n];

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

            totalminsum = totalminsum + (left * right * arr[i]);
        }


        Stack<Integer> s3 = new Stack<>();

        for(int i=0; i<n; i++){
            while(!s3.isEmpty() && arr[i] > arr[s3.peek()]){
                s3.pop();
            }

            if(s3.isEmpty()){
                ple[i] = -1;
            }else{
                ple[i] = s3.peek();
            }

            s3.push(i);
        }

        Stack<Integer> s4 = new Stack<>();

        for(int i=n-1; i>=0; i--){
            while(!s4.isEmpty() && arr[i] >= arr[s4.peek()]){
                s4.pop();
            }

            if(s4.isEmpty()){
                nle[i] = n;
            }else{
                nle[i] = s4.peek();
            }

            s4.push(i);
        }

        for(int i=0; i<n; i++){
            long left = i - ple[i];
            long right = nle[i] - i;

            totalmaxsum = totalmaxsum + (left * right * arr[i]);
        }

        return totalmaxsum - totalminsum;
    }
}