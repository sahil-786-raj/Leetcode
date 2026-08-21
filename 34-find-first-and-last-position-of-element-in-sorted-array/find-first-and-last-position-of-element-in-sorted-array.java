class Solution {

    public static int searchfirst(int arr[], int target){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int res = -1;

        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] == target){
                res = mid;
                e = mid-1;
            }else if(arr[mid] > target){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return res;
    }

    public static int searchlast(int arr[], int target){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int res = -1;

        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] == target){
                res = mid;
                s = mid+1;
            }else if(arr[mid] > target){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return res;
    }
    
    public int[] searchRange(int[] arr, int target) {
        int first = searchfirst(arr, target);
        int last = searchlast(arr, target);

        int fnlarr[] = {first, last};

        return fnlarr;
    }
}