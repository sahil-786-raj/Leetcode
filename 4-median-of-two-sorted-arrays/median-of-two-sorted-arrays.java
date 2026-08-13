class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int k=0;
        int m = nums1.length;
        int n = nums2.length;
        int arr[] = new int[m+n];
        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                arr[k] = nums1[i];
                k++;
                i++;
            }else{
                arr[k] = nums2[j];
                k++;
                j++;
            }
        }

        while(i<m){
            arr[k] = nums1[i];
            k++;
            i++;
        }

        while(j<n){
            arr[k] = nums2[j];
            k++;
            j++;
        }

        int s = 0;
        int e = arr.length - 1;
        int mid = (s+e) / 2;

        if(arr.length % 2 != 0){
            return (double)arr[mid];
        }

        double res = (arr[mid] + arr[mid+1]) /2.0; 
        
        return res;
    
    }
}