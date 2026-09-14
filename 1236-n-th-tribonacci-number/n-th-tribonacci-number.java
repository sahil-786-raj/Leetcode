class Solution {
    public static int trifibo(int n, int arr[]){
        if(n == 0){
            return n;
        }
        if(n == 1 || n == 2){
            return 1;
        }

        if(arr[n] != -1){
            return arr[n];
        }

        arr[n] = trifibo(n-1, arr) + trifibo(n-2, arr) + trifibo(n-3, arr);

        return arr[n];
    }
    public int tribonacci(int n) {
        int arr[] = new int[n+1];
        Arrays.fill(arr, -1);

        return trifibo(n, arr);
    }
}