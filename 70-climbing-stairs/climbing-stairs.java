class Solution {
    public static int ways(int n, int arr[]){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }

        if(arr[n] != 0){
            return arr[n];
        }

        arr[n] = ways(n-1, arr) + ways(n-2, arr);

        return arr[n];
    }
    public int climbStairs(int n) {
        int arr[] = new int[n+1];
        return ways(n, arr);
    }
}