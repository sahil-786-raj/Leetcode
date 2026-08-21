class Solution {
    public int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        int s = 0; 
        int e = arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;

            if(arr[s] <= arr[mid]){
                min = Math.min(min, arr[s]);
                s = mid+1;
            }else{
                min = Math.min(min, arr[mid]);
                e = mid-1;
            }
        }
        return min;
    }
}